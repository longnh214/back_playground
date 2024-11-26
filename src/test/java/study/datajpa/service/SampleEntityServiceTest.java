package study.datajpa.service;

import org.hibernate.StaleStateException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.entity.SampleEntity;
import study.datajpa.facade.SampleEntityFacade;
import study.datajpa.repository.SampleEntityRepository;

import javax.persistence.OptimisticLockException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SampleEntityServiceTest {

    @Autowired
    private SampleEntityRepository sampleEntityRepository;

    @Autowired
    private SampleEntityService sampleEntityService;

    @Autowired
    private SampleEntityFacade sampleEntityFacade;

    @BeforeEach
    void setUp(){
        SampleEntity sampleEntity = new SampleEntity();
        sampleEntity.setId(1L);
        sampleEntity.setQuantity(100L);

        sampleEntityRepository.save(sampleEntity);
    }
    @AfterEach
    void tearDown() {
        sampleEntityRepository.deleteAll();
    }

    @Test
    @DisplayName("낙관적 락 테스트")
    void optimisticLockTest(){
        sampleEntityService.updateOptimisticSampleEntity(1L);
    }

    @Test
    @DisplayName("낙관적 락 순차적 테스트")
    void optimisticLockTestNonThread10() throws InterruptedException {
        final int threadCount = 10;

        for(int i=0;i<threadCount;i++){
            sampleEntityFacade.updateEntityOptimistic(1L);
        }

        SampleEntity sampleEntity = sampleEntityRepository.findByIdWithOptimisticLock(1L);

        assertEquals(90L, sampleEntity.getQuantity());
    }

    @Test
    @DisplayName("낙관적 락 동시성 테스트")
    void optimisticLockTest10() throws InterruptedException{
        final int threadCount = 10;
        final ExecutorService executorService = Executors.newFixedThreadPool(8);
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for(int i=0;i<threadCount;i++){
            executorService.submit(() -> {
                try{
                    sampleEntityFacade.updateEntityOptimistic(1L);
                } catch (InterruptedException | OptimisticLockException | StaleStateException e) {
                    System.out.println("Exception occurred: " + e.getMessage());
                } finally{
                    countDownLatch.countDown();
                }
            });
        }

        // 모든 스레드 작업 완료 대기
        countDownLatch.await();
        executorService.shutdown();

        SampleEntity sampleEntity = sampleEntityRepository.findByIdWithOptimisticLock(1L);
        System.out.println(sampleEntity.getVersion());

        assertEquals(90L, sampleEntity.getQuantity());
    }

    @Test
    @DisplayName("비관적 락 테스트")
    void pessimisticLockTest() throws InterruptedException {
        sampleEntityService.updatePessimisticSampleEntity(1L);
    }

    @Test
    @DisplayName("비관적 락 동시성 테스트")
    void pessimisticLockTest10() throws InterruptedException{
        final int threadCount = 10;
        final ExecutorService executorService = Executors.newFixedThreadPool(1);
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for(int i=0;i<threadCount;i++){
            executorService.submit(() -> {
                try{
                    sampleEntityService.updatePessimisticSampleEntity(1L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally{
                    countDownLatch.countDown();
                }
            });
        }

        // 모든 스레드 작업 완료 대기
        countDownLatch.await();
        executorService.shutdown();

        SampleEntity sampleEntity = sampleEntityRepository.findByIdWithPessimisticLock(1L);

        assertEquals(10L, sampleEntity.getVersion());
        assertEquals(90L, sampleEntity.getQuantity());
    }
}
package study.datajpa.facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.datajpa.entity.SampleEntity;
import study.datajpa.repository.SampleEntityRepository;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class NamedLockFacadeTest {
    @Autowired
    private SampleEntityRepository sampleEntityRepository;

    @Autowired
    private NamedLockFacade namedLockFacade;

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
    @DisplayName("네임드 락 동시성 테스트")
    void namedLockTest10() throws InterruptedException {
        final int threadCount = 10;
        final ExecutorService executorService = Executors.newFixedThreadPool(8);
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for(int i=0;i<threadCount;i++){
            executorService.submit(() -> {
                try{
                    namedLockFacade.updateNamedSampleEntity(1L);
                } catch (Exception e) {
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

        assertEquals(90L, sampleEntity.getQuantity());
    }
}
package study.datajpa.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import study.datajpa.service.SampleEntityService;

@Component
@RequiredArgsConstructor
public class SampleEntityFacade {
    private final SampleEntityService sampleEntityService;

    public void updateEntityOptimistic(Long id) throws InterruptedException {
        int retryCount = 0;
        int maxRetry = 5; // 최대 재시도 횟수

        while (retryCount < maxRetry) {
            try {
                sampleEntityService.updateOptimisticSampleEntity(id);
                break; // 성공적으로 업데이트되면 반복 종료
            } catch (Exception e) {
                retryCount++;
                System.out.println("낙관적 락 충돌 발생, 재시도: " + retryCount);
                if (retryCount >= maxRetry) {
                    throw e;
                }
                Thread.sleep(50); // 잠시 대기 후 재시도
            }
        }
    }
}
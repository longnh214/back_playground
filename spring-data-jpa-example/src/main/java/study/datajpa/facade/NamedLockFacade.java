package study.datajpa.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import study.datajpa.repository.LockRepository;
import study.datajpa.service.SampleEntityService;

import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
public class NamedLockFacade {
    private final LockRepository lockRepository;
    private final SampleEntityService sampleEntityService;

    @Transactional
    public void updateNamedSampleEntity(Long id){
        try{
            lockRepository.getLock(id.toString());
            sampleEntityService.decrease(id);
        }finally {
            lockRepository.releaseLock(id.toString());
        }
    }
}
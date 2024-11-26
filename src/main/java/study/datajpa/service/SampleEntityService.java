package study.datajpa.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.entity.SampleEntity;
import study.datajpa.repository.SampleEntityRepository;

@Service
@RequiredArgsConstructor
public class SampleEntityService {
    private final SampleEntityRepository sampleEntityRepository;

    @Transactional
    public void updateOptimisticSampleEntity(Long id){
        SampleEntity sampleEntity = sampleEntityRepository.findByIdWithOptimisticLock(id);
        sampleEntity.decrease(1L);

        sampleEntityRepository.saveAndFlush(sampleEntity);
    }

    @Transactional
    public void updatePessimisticSampleEntity(Long id) throws InterruptedException{
        SampleEntity sampleEntity = sampleEntityRepository.findByIdWithPessimisticLock(id);
        sampleEntity.decrease(1L);

        sampleEntityRepository.saveAndFlush(sampleEntity);
    }
}
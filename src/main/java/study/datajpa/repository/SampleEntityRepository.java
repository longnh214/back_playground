package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.entity.SampleEntity;

import javax.persistence.LockModeType;

@Repository
public interface SampleEntityRepository extends JpaRepository<SampleEntity, Long> {

    @Lock(LockModeType.OPTIMISTIC)
    @Query("select s from SampleEntity s where s.id = :id")
    @Transactional
    SampleEntity findByIdWithOptimisticLock(@Param("id") Long id);

    @Transactional
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("select s from SampleEntity s where s.id = :id")
    SampleEntity findByIdWithPessimisticLock(@Param("id") Long id);
}
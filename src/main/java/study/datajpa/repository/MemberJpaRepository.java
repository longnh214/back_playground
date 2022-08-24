package study.datajpa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;

@Repository
@Transactional
public class MemberJpaRepository {

  @PersistenceContext //Spring boot, container가 jpa의 영속성 컨텍스트를 가져다준다.
  private EntityManager em;

  public Member save(Member member){
    em.persist(member);
    return member;
  }

  public Member find(Long id){
    return em.find(Member.class, id);
  }
}
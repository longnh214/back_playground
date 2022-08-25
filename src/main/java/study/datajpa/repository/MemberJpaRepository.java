package study.datajpa.repository;

import java.util.List;
import java.util.Optional;
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

  public void delete(Member member){
    em.remove(member);
  }

  public List<Member> findAll(){
    //JPQL(jpa가 제공하는 쿼리 문법)
    return em.createQuery("select m from Member m", Member.class)
        .getResultList();
  }

  public Optional<Member> findById(Long id){
    Member member  = em.find(Member.class, id);
    return Optional.ofNullable(member); // Java 8 기본 (공부 할 것)
  }

  public long count(){
    return em.createQuery("select count(m) from Member m", Long.class)
        .getSingleResult();
  }

  public Member find(Long id){
    return em.find(Member.class, id);
  }
}
package study.datajpa.repository;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import study.datajpa.entity.Member;
import study.datajpa.entity.Team;

@Repository
public class TeamJpaRepository {

  @PersistenceContext
  private EntityManager em;

  public Team save(Team team){
    em.persist(team);
    return team;
  }

  public void delete(Team team){
    em.remove(team);
  }

  public List<Team> findAll(){
    return em.createQuery("select t from Team t", Team.class)
        .getResultList();
  }

  public Optional<Team> findById(Long id){
    Team team  = em.find(Team.class, id);
    return Optional.ofNullable(team); // Java 8 기본 (공부 할 것)
  }

  public long count(){
    return em.createQuery("select count(t) from Member t", Long.class)
        .getSingleResult();
  }

  public Team find(Long id){
    return em.find(Team.class, id);
  }
}

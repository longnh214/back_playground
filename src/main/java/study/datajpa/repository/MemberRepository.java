package study.datajpa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import study.datajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
  List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

  List<Member> findTop3HelloBy();

  //@Query(name = "Member.findByUsername") //Entity의 NamedQuery를 찾아서 실행해준다.
  //먼저 이름에 맞는 namedQuery가 있는 지 찾고, 없으면 쿼리 메소드가 있는 지 확인을 해서 해당되는 메소드를 실행한다.
  //실무에서 실제로 잘 쓰이지는 않는다.
  //NamedQuery가 가지는 큰 장점 : 쿼리의 문법 오류를 애플리케이션 로딩 시점에 파싱해서 검증한다.
  List<Member> findByUsername(@Param("username") String username);

  //실무에서 많이 쓰는 기능!
  //조건을 넣는 쿼리도 쉽게 메소드화 할 수 있다!
  //이 기능도 문법 오류를 어플리케이션 로딩 시점에 파싱해서 검증한다.
  @Query("select m from Member m where m.username = :username and m.age = :age")
  List<Member> findUser(@Param("username") String username, @Param("age") int age);
}

package study.datajpa.entity;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Parameter;

@Entity
@Getter
@Setter
@ToString(of = {"id", "username", "age"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@NamedQuery(
    name="Member.findByUsername",
    query="select m from Member m where m.username = :username"
)
public class Member {
  @Id
//  @GenericGenerator(
//          name = "MEMBER_SEQ_GENERATOR",
//          strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//          parameters = {
//                  @Parameter(name = "sequence_name", value = "MEMBER_SECOND_SEQ"),
//                  @Parameter(name = "optimizer", value = "pooled"),
//                  @Parameter(name = "initial_value", value = "1"),
//                  @Parameter(name = "increment_size", value = "500")
//          }
//  )
  @SequenceGenerator(
          name = "MEMBER_SEQ_GENERATOR",   // 식별자 생성기 이름
          sequenceName = "MEMBER_SEQ",  // 데이터베이스에 등록되어있는 시퀀스 이름: DB에는 해당 이름으로 매핑된다.
          initialValue = 1,  // DDL 생성시에만 사용되며 시퀀스 DDL을 생성할 때 처음 시작하는 수를 지정
          allocationSize = 50  // 시퀀스 한 번 호출에 증가하는 수
  )
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id")
  private Long id;
  private String username;
  private int age;

  @ManyToOne(fetch = FetchType.LAZY)
  //실무에서 모든 연관관계는 지연 로딩을 걸어야 한다. 즉시 로딩은 성능 최적화하기 너무 어렵다.
  //지연로딩 : 멤버를 조회하고 있을 때에는 멤버만 조회, 멤버를 조회할 때 팀은 임시 객체를 두고,
  //      팀 정보가 필요할 때에만 팀 정보를 조회하는 쿼리를 날린다.
  @JoinColumn(name = "team_id")
  private Team team;

  public Member(String username) {
    this.username = username;
  }

  public Member(String username, int age, Team team) {
    this.username = username;
    this.age = age;
    if(team != null) {
      this.changeTeam(team);
    }
  }

  public Member(String username, int age) {
    this.username = username;
    this.age = age;
  }

  public void changeUsername(String username){
    this.username = username;
  }

  public void changeTeam(Team team){
    this.team = team;
    team.getMembers().add(this);
  }
}

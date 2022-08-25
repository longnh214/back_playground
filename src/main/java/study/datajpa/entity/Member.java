package study.datajpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@ToString(of = {"id", "username", "age"})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {
  @Id @GeneratedValue
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

  public void changeUsername(String username){
    this.username = username;
  }

  public void changeTeam(Team team){
    this.team = team;
    team.getMembers().add(this);
  }
}

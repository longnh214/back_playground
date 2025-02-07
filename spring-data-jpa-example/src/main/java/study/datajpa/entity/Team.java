package study.datajpa.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name"})
public class Team {
  @Id
  @GeneratedValue
  @Column(name = "team_id")
  private Long id;
  private String name;

  @OneToMany(mappedBy = "team")
  //foreign key가 없는 쪽에 mappedBy,
  //1대 다 중 다에 foreign key가 있어야한다.
  private List<Member> members = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }
}

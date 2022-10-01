package study.datajpa.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;
import study.datajpa.dto.MemberDto;
import study.datajpa.entity.Member;
import study.datajpa.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
@Transactional //같은 트랜잭션에서 영속성 컨텍스트가 같은 인스턴스임을 보장한다.
@Rollback(false)
class MemberRepositoryTest {

  @Autowired MemberRepository memberRepository;
  @Autowired TeamRepository teamRepository;
  @PersistenceContext
  EntityManager entityManager;



  @Test
  public void testMember(){
    Member member = new Member("memberA");
    Member savedMember = memberRepository.save(member);

    Member findMember = memberRepository.findById(savedMember.getId()).orElseThrow();

    assertThat(findMember.getId()).isEqualTo(member.getId());
    assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
    assertThat(findMember).isEqualTo(member);
  }

  @Test
  public void basicCRUD(){
    Member member1 = new Member("member1");
    Member member2 = new Member("member2");
    memberRepository.save(member1);
    memberRepository.save(member2);

    //단 건 조회 검증
    Member findMember1 = memberRepository.findById(member1.getId()).orElseThrow();
    Member findMember2 = memberRepository.findById(member2.getId()).orElseThrow();

    assertThat(findMember1).isEqualTo(member1);
    assertThat(findMember2).isEqualTo(member2);

    //리스트 조회 검증
    List<Member> all = memberRepository.findAll();
    assertThat(all.size()).isEqualTo(2);

    //count 검증
    long count = memberRepository.count();
    assertThat(count).isEqualTo(2);

    //삭제 검증
    memberRepository.delete(member1);
    memberRepository.delete(member2);

    long deletedCount = memberRepository.count();
    assertThat(deletedCount).isEqualTo(0);
  }

  @Test
  public void findByUsernameAndAgeGreaterThan(){
    Member member1 = new Member("AAA", 10);
    Member member2 = new Member("AAA", 20);

    memberRepository.save(member1);
    memberRepository.save(member2);

    List<Member> result = memberRepository.findByUsernameAndAgeGreaterThan("AAA",15);

    assertThat(result.get(0).getUsername()).isEqualTo("AAA");
    assertThat(result.get(0).getAge()).isEqualTo(20);
    assertThat(result.size()).isEqualTo(1);
  }

  @Test
  public void testNamedQuery(){
    Member member1 = new Member("AAA", 10);
    Member member2 = new Member("BBB", 20);

    memberRepository.save(member1);
    memberRepository.save(member2);

    List<Member> result = memberRepository.findByUsername("AAA");
    Member findMember = result.get(0);

    assertThat(findMember).isEqualTo(member1);
  }

  @Test
  public void testQuery(){
    Member member1 = new Member("AAA", 10);
    Member member2 = new Member("BBB", 20);

    memberRepository.save(member1);
    memberRepository.save(member2);

    List<Member> result = memberRepository.findUser("AAA", 10);
    Member findMember = result.get(0);

    assertThat(findMember).isEqualTo(member1);
  }

  @Test
  public void findUsernameList(){
    Member member1 = new Member("AAA", 10);
    Member member2 = new Member("BBB", 20);

    memberRepository.save(member1);
    memberRepository.save(member2);

    List<String> usernameList = memberRepository.findUsername();
    for(String s : usernameList){
      System.out.println("s = " + s);
    }
  }

  @Test
  public void findMemberDtoTest(){
    Member member1 = new Member("AAA", 10);

    Team team = new Team("teamA");

    member1.setTeam(team);

    teamRepository.save(team);
    memberRepository.save(member1);

    List<MemberDto> memberDtoList = memberRepository.findMemberDto();

    for(MemberDto dto : memberDtoList){
      System.out.println("dto = " + dto);
    }
  }

  @Test
  public void findByNames(){
    Member member1 = new Member("AAA", 10);

    Team team = new Team("teamA");

    member1.setTeam(team);

    teamRepository.save(team);
    memberRepository.save(member1);

    List<Member> result = memberRepository.findByNames(Arrays.asList("AAA", "BBB"));

    for(Member member : result){
      System.out.println("member = " + member);
    }
  }
  
  @Test
  public void returnType(){
    Member member1 = new Member("AAA", 10);
    Member member2 = new Member("BBB", 20);

    memberRepository.save(member1);
    memberRepository.save(member2);

    List<Member> aaa = memberRepository.findListByUsername("AAA");
    Member member = memberRepository.findMemberByUsername("steadfast"); //단건 일 경우 없으면 null이다.
    Optional<Member> optionalMember = memberRepository.findOptionalByUsername("steadfast"); //nullable 하면 optional로 처리한다.
    //Optional 객체에 값 두개인 결과가 나오면 exception이 터진다.
    assertThat(optionalMember).isEqualTo(Optional.empty());
  }

  @Test
  public void paging(){
    //given
    memberRepository.save(new Member("member1", 10));
    memberRepository.save(new Member("member2", 10));
    memberRepository.save(new Member("member3", 10));
    memberRepository.save(new Member("member4", 10));
    memberRepository.save(new Member("member5", 10));

    PageRequest pageRequest = PageRequest.of(0, 3, Sort.by(Sort.Direction.DESC, "username"));

    int age = 10;
    int offset = 0;
    int limit = 3;

    //when
    //페이지(Entity)는 그대로 반환하면 안된다. DTO로 변환해서 반환하는 게 좋다. 엔티티는 외부에 노출시키면 안된다.
    Page<Member> page = memberRepository.findByAge(age, pageRequest);

    //Entity -> DTO 변환
    //page.map(member -> new MemberDto(member.getId(), member.getUsername(), null));
    //Page<MemberDto> toMap = page.map(member -> new MemberDto(member.getId(), member.getUsername(), null));
    //반환 가능

    //페이지 계산 공식 적용...
    //totalPage = totalCount / size ...

    //then
    List<Member> content = page.getContent();
    long totalElements = page.getTotalElements();

    assertThat(content.size()).isEqualTo(3);
    assertThat(page.getTotalElements()).isEqualTo(5L);
    assertThat(page.getNumber()).isEqualTo(0);
    assertThat(page.getTotalPages()).isEqualTo(2);
    assertThat(page.isFirst()).isTrue();
    assertThat(page.hasNext()).isTrue();
  }

  @Test
  public void slice(){
    //given
    memberRepository.save(new Member("member1", 10));
    memberRepository.save(new Member("member2", 10));
    memberRepository.save(new Member("member3", 10));
    memberRepository.save(new Member("member4", 10));
    memberRepository.save(new Member("member5", 10));

    PageRequest pageRequest = PageRequest.of(0, 3, Sort.by(Sort.Direction.DESC, "username"));

    int age = 10;
    int offset = 0;
    int limit = 3;

    //when
    Slice<Member> page = memberRepository.findByAge(age, pageRequest);

    //페이지 계산 공식 적용...
    //totalPage = totalCount / size ...

    //then
    List<Member> content = page.getContent();

    assertThat(content.size()).isEqualTo(3);
    assertThat(page.getNumber()).isEqualTo(0);
    assertThat(page.isFirst()).isTrue();
    assertThat(page.hasNext()).isTrue();
  }

  @Test
  public void bulkUpdate(){
    //given
    memberRepository.save(new Member("member1", 10));
    memberRepository.save(new Member("member2", 19));
    memberRepository.save(new Member("member3", 20));
    memberRepository.save(new Member("member4", 21));
    memberRepository.save(new Member("member5", 40));
    //영속성 컨텍스트를 거치지 않기 때문에 DB와 영속성 컨텍스트의 싱크가 안 맞을 수 있다.

    //when
    int resultCount = memberRepository.bulkAgePlus(20);

    // 대신에 @Modifying에서 clearAutomatically=true 옵션을 줘도 된다.
    // entityManager.flush(); //영속성 컨텍스트 동기화
    // entityManager.clear(); //영속성 컨텍스트 초기화

    List<Member> result = memberRepository.findByUsername("member5");
    Member member5 = result.get(0);
    System.out.println(member5.getAge());

    //then
    assertThat(resultCount).isEqualTo(3);
  }
}
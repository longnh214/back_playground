package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

  //new 생성자를 통해 실제 객체를 의존한다는 것이 문제이다.(DIP 위반)
  private final MemberRepository memberRepository;

  @Autowired //자동 의존 관계 주입 ex) ac.getBean(MemberRepository.class);
  public MemberServiceImpl(MemberRepository memberRepository){
    this.memberRepository = memberRepository;
  }

  @Override
  public void join(Member member) {
    memberRepository.save(member);
  }

  @Override
  public Member findMember(Long memberId) {
    return memberRepository.findById(memberId);
  }

  //Test 용도
  public MemberRepository getMemberRepository(){
    return memberRepository;
  }
}

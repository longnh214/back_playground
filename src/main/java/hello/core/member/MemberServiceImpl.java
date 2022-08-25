package hello.core.member;

public class MemberServiceImpl implements MemberService{

  //new 생성자를 통해 실제 객체를 의존한다는 것이 문제이다.(DIP 위반)
  private final MemberRepository memberRepository;

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
}

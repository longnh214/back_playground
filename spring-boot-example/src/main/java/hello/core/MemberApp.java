package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
  public static void main(String[] args) {
//    AppConfig appConfig = new AppConfig();
//    MemberService memberService = appConfig.memberService();
//    MemberService memberService = new MemberServiceImpl();

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class); // 설정 파일을 가지 각 필요한 구현체들을 스프링 컨테이너에 Bean으로 등록시킨다.
    MemberService memberService = applicationContext.getBean("memberService", MemberService.class); //기본적으로 메소드 이름으로 Bean이 등록이 된다.

    Member member = new Member(1L, "memberA", Grade.VIP);
    memberService.join(member);

    Member findMember = memberService.findMember(1L);

    System.out.println("new member => " + member.getName());
    System.out.println("find member => " + findMember.getName());
  }
}

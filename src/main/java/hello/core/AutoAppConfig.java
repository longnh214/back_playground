package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    //basePackages 를 지정하지 않으면 현재 클래스의 패키지를 기준으로 하위를 전부 탐색한다.
    excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
//  @Bean(name = "memoryMemberRepository") //이름이 겹치면 수동 등록 빈이 우선권을 가져서 오버라이드 시켜준다.
//  MemberRepository memberRepository(){
//    return new MemoryMemberRepository();
//  }
}

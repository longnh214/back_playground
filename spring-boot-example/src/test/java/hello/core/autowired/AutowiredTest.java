package hello.core.autowired;

import hello.core.member.Member;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

public class AutowiredTest {

  @Test
  void AutowiredOption(){
    ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
  }

  static class TestBean{
    @Autowired(required = false) //의존 관계가 없으면 호출이 아예 안됨.
    public void setNoBean1(Member noBean1){
      System.out.println("noBean1 = " + noBean1);
    }

    @Autowired //의존 관계가 없으면 null 반환.
    public void setNoBean2(@Nullable Member noBean2){
      System.out.println("noBean2 = " + noBean2);
    }

    @Autowired //의존 관계가 없으면 Optional.empty 반환.
    public void setNoBean3(Optional<Member> noBean3){
      System.out.println("noBean3 = " + noBean3);
    }
  }
}

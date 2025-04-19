package hello.core.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Provider;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

class SingletonWithPrototypeTest {
  @Test
  void prototypeField(){
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);
    PrototypeBean prototypeBean1 = ac.getBean(PrototypeBean.class);
    prototypeBean1.addCount();
    Assertions.assertThat(prototypeBean1.getCount()).isEqualTo(1);

    PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);
    prototypeBean2.addCount();
    Assertions.assertThat(prototypeBean2.getCount()).isEqualTo(1);
  }

  @Test
  void singletonClientUsePrototype(){
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ClientBean.class, PrototypeBean.class);
    ClientBean clientBean1 = ac.getBean(ClientBean.class);
    Assertions.assertThat(clientBean1.logic()).isEqualTo(1);

    ClientBean clientBean2 = ac.getBean(ClientBean.class);
    Assertions.assertThat(clientBean2.logic()).isEqualTo(2);
  }

  @Test
  void singletonClientUsePrototypeProvider(){
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ClientBean3.class, PrototypeBean.class);
    ClientBean3 clientBean1 = ac.getBean(ClientBean3.class);
    Assertions.assertThat(clientBean1.logic()).isEqualTo(1);

    ClientBean3 clientBean2 = ac.getBean(ClientBean3.class);
    Assertions.assertThat(clientBean2.logic()).isEqualTo(1);
  }

  @Scope("singleton")
  @RequiredArgsConstructor
  static class ClientBean{
    private final PrototypeBean prototypeBean; //생성 시점에 이미 주입이 되어있다.

    public int logic() {
      prototypeBean.addCount();
      return prototypeBean.getCount();
    }
  }

  @Scope("singleton")
  static class ClientBean2{
    @Autowired
    ObjectFactory<PrototypeBean> prototypeBeanFactory;

    @Autowired
    ObjectProvider<PrototypeBean> prototypeBeanProvider;

    public int logic() { //ObjectFactory 이용
      PrototypeBean prototypeBean = prototypeBeanFactory.getObject();
      prototypeBean.addCount();
      return prototypeBean.getCount();
    }

    public int logic2() { //ObjectProvider 이용
      PrototypeBean prototypeBean = prototypeBeanProvider.getObject();
      prototypeBean.addCount();
      return prototypeBean.getCount();
    }
  }

  @Scope("singleton")
  static class ClientBean3{
    @Autowired
    Provider<PrototypeBean> prototypeBeanProvider;

    public int logic() { //Provider 이용
      PrototypeBean prototypeBean = prototypeBeanProvider.get();
      prototypeBean.addCount();
      return prototypeBean.getCount();
    }
  }

  @Scope("prototype")
  static class PrototypeBean{
    private int count = 0;

    public void addCount(){
      count++;
    }

    public int getCount(){
      return count;
    }

    @PostConstruct
    public void init(){
      System.out.println("PrototypeBean.init " + this);
    }

    @PreDestroy
    public void destroy(){
      System.out.println("PrototypeBean.destroy " + this);
    }
  }
}

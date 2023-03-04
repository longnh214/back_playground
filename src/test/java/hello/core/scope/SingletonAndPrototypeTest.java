package hello.core.scope;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

class SingletonAndPrototypeTest {
  @Test
  void singletonBeanFind(){
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SingletonBean.class);

    SingletonBean singletonBean1 = ac.getBean(SingletonBean.class);
    SingletonBean singletonBean2 = ac.getBean(SingletonBean.class);

    System.out.println("singletonBean1 = " + singletonBean1);
    System.out.println("singletonBean2 = " + singletonBean2);

    Assertions.assertEquals(singletonBean1, singletonBean2);

    ac.close();
  }

  @Test
  void prototypeBeanFind(){
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);

    System.out.println("find prototypeBean1");
    PrototypeBean prototypeBean1 = ac.getBean(PrototypeBean.class);
    System.out.println("find prototypeBean2");
    PrototypeBean prototypeBean2 = ac.getBean(PrototypeBean.class);

    System.out.println("prototypeBean1 = " + prototypeBean1);
    System.out.println("prototypeBean2 = " + prototypeBean2);

    Assertions.assertNotEquals(prototypeBean1, prototypeBean2);

    prototypeBean1.destroy();
    prototypeBean2.destroy();

    ac.close();
  }

  @Scope("singleton")
  static class SingletonBean{
   @PostConstruct
   public void init(){
     System.out.println("singleton bean init");
   }

   @PreDestroy
    public void destroy(){
     System.out.println("singleton bean destroy");
   }
  }

  @Scope("prototype")
  static class PrototypeBean{
   @PostConstruct
   public void init(){
     System.out.println("prototype bean init");
   }

   @PreDestroy
    public void destroy(){
     System.out.println("prototype bean destroy");
   }
  }
}

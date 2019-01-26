package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        Greeter g2 = ctx.getBean(Greeter.class);
        // 스프링은 한 개의 빈 객체만을 생성하며
        System.out.println("(g1==g2) =" + (g1==g2));
        ctx.close();



    }
}

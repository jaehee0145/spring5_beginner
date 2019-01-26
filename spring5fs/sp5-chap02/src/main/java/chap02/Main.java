package chap02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
//자바 설정에서 정보를 읽어와 빈 객체를 생성하고 관리한다.
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g = ctx.getBean("greeter", Greeter.class);
        String msg = g.greet("spring");
        System.out.println(msg);
        ctx.close();

    }

}

package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 해당 클래스를 spring 설정 클래스로 설정
public class AppContext {

	@Bean //
	public Greeter greeter() {
		Greeter g = new Greeter();
		g.setFormat("%s, yes!!");
				return g;
	}
	
}

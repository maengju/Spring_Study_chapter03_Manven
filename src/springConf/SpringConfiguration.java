package springConf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sample01.LoggingAdvice;
import sample01.MessageBeanImpl;

@Configuration
@EnableAspectJAutoProxy //AOP기능을 자동으로 넣는것
public class SpringConfiguration {

	@Bean
	public MessageBeanImpl messageBeanImpl (){		//메소드명은 반드시 클래스의 객체명 또는 bean명을 잡아준다.
		return new MessageBeanImpl();
	}
	
	@Bean
	public LoggingAdvice loggingAdvice() {
		return new LoggingAdvice();
	}
	
	
}

package in.ineuron;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Boot02DependencyInjectionApplication {
	
	static {
		System.out.println("Boot02DependencyInjectionApplication.class file is loading...");
	}

	
	public Boot02DependencyInjectionApplication() {
		System.out.println("Boot02DependencyInjectionApplication:: Zero param Constructor...");
	}
	
	@Bean
	public LocalDateTime createObj() {
		System.out.println("Boot02DependencyInjectionApplication.createObj()");
		return LocalDateTime.now();
	}


	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(Boot02DependencyInjectionApplication.class, args);
		System.out.println(context.getClass().getName());
	}

}

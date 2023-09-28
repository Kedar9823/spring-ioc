package in.ineuron.commons;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "in.ineuron" )
public class ConfigApp {
	
	static {
		System.out.println("ConfigApp.class file loading...");
	}
	
	public ConfigApp() {
		System.out.println("ConfigApp Instantiated...");
	}


	@Bean(value="date1")
	public LocalDateTime createObj1() {
		System.out.println("ConfigApp.createHours1()...");
		return LocalDateTime.now();
	}
	
	@Bean(value="date2")
	public LocalDateTime createObj2() {
		System.out.println("ConfigApp.createHours2()...");
		return LocalDateTime.now();
	}
}

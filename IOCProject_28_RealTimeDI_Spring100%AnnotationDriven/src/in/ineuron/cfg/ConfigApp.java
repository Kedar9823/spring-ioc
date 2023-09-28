package in.ineuron.cfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "in.ineuron")
@Import(value =  PersistenceConfig.class)
public class ConfigApp {
	
	static {
		System.out.println("ConfigApp.class file loading...");
	}

	public ConfigApp() {
		System.out.println("ConfigApp Zero param constructor...");
	}
}

package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Company;

@SpringBootApplication
public class Boot03BulkLoadingAppApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(Boot03BulkLoadingAppApplication.class, args);
		
		Company company1 = context.getBean(Company.class);
		System.out.println(company1);
		
		System.in.read();
		
		((ConfigurableApplicationContext) context).close();	
	}
}




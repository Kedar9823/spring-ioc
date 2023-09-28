
package in.ineuron.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.Voter;


public class MainApp {
	public static void main(String[] args) throws IOException {		
		System.out.println("\n******** CONTAINER STARTED *********");
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/config/applicationContext.xml");
		System.out.println("\nBeans: "+Arrays.toString(context.getBeanDefinitionNames()));
		System.in.read();
		
		Voter voter = context.getBean(Voter.class);
		
		System.out.println(voter);
		
		System.out.println(voter.votingEligibility());
		
		((AbstractApplicationContext) context).close();
		System.out.println("\n******** CONTAINER STOPPED *********");
		
	}	
}

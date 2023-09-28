
package in.ineuron.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.commons.ConfigApp;
import in.ineuron.component.WishMessageGenerator;


public class MainApp {
	public static void main(String[] args) throws IOException {		
		System.out.println("\n******** CONTAINER STARTED *********\n");
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
		System.out.println("\nBeans: "+Arrays.toString(context.getBeanDefinitionNames()));
		System.in.read();
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		System.out.println("\n"+wmg.generateMessage("Kedar"));
		((AbstractApplicationContext) context).close();
		System.out.println("\n******** CONTAINER STOPPED *********");
		
	}	
}

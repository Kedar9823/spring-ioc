package in.ineuron.Main;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.WishMessageGenerator;

public class SetterInjectionUsingApplicationContext {
	public static void main(String[] args) throws Exception
	{

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		System.out.println("\nNo of beans is :: "+factory.getBeanDefinitionCount());
		System.out.println("Bean id is :: "+Arrays.toString(factory.getBeanDefinitionNames()));
		
		System.out.println();
		//WishMessageGenerator wishMessage = (WishMessageGenerator) obj;
		
		// Accessing bean using alias name
		WishMessageGenerator wmg = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println("HashCode value of wmg is :: "+wmg.hashCode());
		System.out.println(wmg);
		
		System.out.println();
		
		//Accessing bean using actual name
		WishMessageGenerator wishMessageGenerator = (WishMessageGenerator) factory.getBean("wishMessageGenerator",WishMessageGenerator.class);
		System.out.println("HashCode value of wishMessageGenerator is :: "+wishMessageGenerator.hashCode());
		System.out.println(wishMessageGenerator);
		
		
		//Closing the container
		System.out.println("\n********Container is closing********");
		((AbstractApplicationContext)factory).close();
	}
}

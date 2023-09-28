package in.ineuron.main;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.WishMessageGenerator;

public class MainAppUsingApplicationContext {
	public static void main(String[] args) throws IOException {
		
		//Activating the IOC-Container(ApplicationContext)
		System.out.println("******************ApplicationContext container starting******************");
		ApplicationContext context = new  ClassPathXmlApplicationContext("in/ineuron/config/applicationContext.xml");
		System.out.println("\n******************ApplicationContext container started******************");
		System.in.read();
		
		//Getting the bean from the container
		WishMessageGenerator wobj = context.getBean("wmg",WishMessageGenerator.class);
		//Using the bean
		System.out.println("Hashcode of wmg ::"+wobj.hashCode());
		System.out.println("Message:: "+wobj.generateMessage("Kedar"));
		
		
		WishMessageGenerator wobj1 = context.getBean("wmg",WishMessageGenerator.class);
		//Using the bean
		System.out.println();
		System.out.println("Hashcode of wmg ::"+wobj1.hashCode());
		System.out.println("Message:: "+wobj1.generateMessage("Virat"));
		
		
		System.out.println("Number of Beans:: "+context.getBeanDefinitionCount());
		System.out.println("Beans:: "+Arrays.toString(context.getBeanDefinitionNames()));
		//Closing the container
		System.out.println("\n********Container is Closed********");
		((AbstractApplicationContext) context).close();
	}
}

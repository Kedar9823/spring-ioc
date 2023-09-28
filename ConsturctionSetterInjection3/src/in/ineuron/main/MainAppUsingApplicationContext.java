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
		
		//Getting the bean from the container
		WishMessageGenerator wobj = context.getBean("wmg",WishMessageGenerator.class);
		System.out.println("Avaliable Beans: "+context.getBeanDefinitionCount());
		System.out.println("Avaliable Beans List: "+Arrays.toString(context.getBeanDefinitionNames()));
		//Using the bean
		System.out.println("Wmg ::"+wobj);

		//Closing the container
		System.out.println("\n********Container is Closed********");
		((AbstractApplicationContext) context).close();
	}
}

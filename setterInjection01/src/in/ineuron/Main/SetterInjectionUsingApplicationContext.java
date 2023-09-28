package in.ineuron.Main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.WishMessageGenerator;

public class SetterInjectionUsingApplicationContext {
	public static void main(String[] args) throws Exception
	{

		System.out.println("********ApplicationContext Container Starting********");
		
		// Activating the Container / IOC-container (ApplicatonContextContainer)
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		System.out.println("\nNo of beans is :: "+factory.getBeanDefinitionCount());
		System.out.println("Bean id is :: "+Arrays.toString(factory.getBeanDefinitionNames()));
		
		System.out.println("\n********ApplicationContext Container Started ********");
		System.in.read();
		
		//WishMessageGenerator wishMessage = (WishMessageGenerator) obj;
		WishMessageGenerator wishMessage = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println("HashCode value of wmg is :: "+wishMessage.hashCode());
		System.out.println();
		System.out.println(wishMessage);
		
		String result1 = wishMessage.generateMessage("Sachin");
		System.out.println("\nResult: "+result1);
		WishMessageGenerator wishMessage2 = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println("HashCode value of wmg is :: "+wishMessage2.hashCode());
		System.out.println();
		System.out.println(wishMessage2);
		
		String result2 = wishMessage2.generateMessage("Kohli");
		System.out.println("\nResult: "+result2);
		
		
		//Closing the container
		System.out.println("\n********Container is closing********");
		factory.close();
	}
}

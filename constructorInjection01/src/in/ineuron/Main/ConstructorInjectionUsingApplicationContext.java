package in.ineuron.Main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.WishMessageGenerator;

public class ConstructorInjectionUsingApplicationContext {
	public static void main(String[] args) throws Exception
	{

		System.out.println("********ApplicationContext Container Starting********");
		
		// Activating the Container / IOC-container (ApplicatonContextContainer)
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		System.out.println("\nNo of beans is :: "+factory.getBeanDefinitionCount());
		System.out.println("Bean id is :: "+Arrays.toString(factory.getBeanDefinitionNames()));
		
		System.out.println("\n********ApplicationContext Container Started ********");
		
		//WishMessageGenerator wishMessage = (WishMessageGenerator) obj;
		WishMessageGenerator wishMessage = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wishMessage);
		
		System.out.println("HashCode value of wmg is :: "+wishMessage.hashCode());
		String result1 = wishMessage.generateMessage("Sachin");
		System.out.println("Result: "+result1);
		WishMessageGenerator wishMessage2 = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println();
		System.out.println(wishMessage2);
		System.out.println("HashCode value of wmg is :: "+wishMessage2.hashCode());
		String result2 = wishMessage2.generateMessage("Kohli");
		System.out.println("Result: "+result2);
		
		
		//Closing the container
		System.out.println("\n********Container is closing********");
		factory.close();
	}
}

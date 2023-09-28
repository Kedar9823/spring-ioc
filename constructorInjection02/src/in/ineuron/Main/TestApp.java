package in.ineuron.Main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.WishMessageGenerator;

public class TestApp {
	public static void main(String[] args) throws Exception
	{

		System.out.println("********ApplicationContext Container Starting********");
		
		// Activating the Container / IOC-container (ApplicatonContextContainer)
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		System.out.println("Bean count is :: "+factory.getBeanDefinitionCount());
		System.out.println("Bean id is    :: "+Arrays.toString(factory.getBeanDefinitionNames()));
		WishMessageGenerator wishMsg = factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wishMsg);
		
		factory.close();
	}
}

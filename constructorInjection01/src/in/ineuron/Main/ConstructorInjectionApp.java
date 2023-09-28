package in.ineuron.Main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.component.WishMessageGenerator;

public class ConstructorInjectionApp {
	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/applicationContext.xml");
		System.out.println("********BeanFactory Container Starting********");
		
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("********BeanFactory Container Started ********");
	
		WishMessageGenerator wishMsg = factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wishMsg);
		String result = wishMsg.generateMessage("Dhoni");
		System.out.println(result);
		
		System.out.println("\n********BeanFactory is closing********");
	}
}

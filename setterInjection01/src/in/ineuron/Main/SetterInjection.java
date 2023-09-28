package in.ineuron.Main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.component.WishMessageGenerator;

public class SetterInjection {
	public static void main(String[] args) {

		FileSystemResource resource = new FileSystemResource("src/applicationContext.xml");
		System.out.println("********BeanFactory Container Starting********");
		
		// Activating the Container / IOC-container (XMLBeanFactory)
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(resource);
		System.out.println("********BeanFactory Container Started ********");
		
		
		// Getting the bean from the container
		//Object obj = factory.getBean("wmg");
		
		//Using the bean
		//WishMessageGenerator wishMessage = (WishMessageGenerator) obj;
		WishMessageGenerator wishMessage = (WishMessageGenerator) factory.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(wishMessage);
		
		String result = wishMessage.generateMessage("Sachin");
		System.out.println("\nResult: "+result);
		
		//Closing the container
		System.out.println("\n********Container is closing********");
	}
}

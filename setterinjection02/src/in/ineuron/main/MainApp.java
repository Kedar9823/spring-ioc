package in.ineuron.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.component.WishMessageGenerator;

public class MainApp {
	public static void main(String[] args) {
		FileSystemResource file = new FileSystemResource("src/in/ineuron/config/applicationContext.xml");
		
		//Activating the IOC-Container(XMLBeanFactory)
		System.out.println("BeanFactory container starting....");
		XmlBeanFactory factory = new  XmlBeanFactory(file);
		System.out.println("BeanFactory container started ....");
		//Getting the bean from the container
		WishMessageGenerator wobj = factory.getBean("wmg",WishMessageGenerator.class);
		//Using the bean
		System.out.println("WishMessagerGenerator:: "+wobj);
		System.out.println("Message:: "+wobj.generateMessage("Kedar"));
		//Closing the container
		System.out.println("********Container is Closed********");
	}
}

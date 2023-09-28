package in.ineuron.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.component.WishMessageGenerator;

public class MainApp2 {
	public static void main(String[] args) {
		FileSystemResource file = new FileSystemResource("src/in/ineuron/config/applicationContext.xml");
		
		//Activating the IOC-Container(XMLBeanFactory)
		System.out.println("BeanFactory container starting....");
		XmlBeanFactory factory = new  XmlBeanFactory(file);
		System.out.println("BeanFactory container started ....");
		//Getting the bean from the container
		WishMessageGenerator wobj = factory.getBean("wmg",WishMessageGenerator.class);
		//Using the bean
		System.out.println("Hashcode of wmg ::"+wobj.hashCode());
		System.out.println("Message:: "+wobj.generateMessage("Kedar"));
		
		
		WishMessageGenerator wobj1 = factory.getBean("wmg",WishMessageGenerator.class);
		//Using the bean
		System.out.println();
		System.out.println("Hashcode of wmg ::"+wobj1.hashCode());
		System.out.println("Message:: "+wobj1.generateMessage("Virat"));
		//Closing the container
		System.out.println("********Container is Closed********");
	}
}

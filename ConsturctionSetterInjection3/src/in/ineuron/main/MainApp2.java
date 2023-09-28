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
		WishMessageGenerator wmg = factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(wmg);
		
		String result = wmg.generateMessage("Virat");
		System.out.println(result);
	}
}

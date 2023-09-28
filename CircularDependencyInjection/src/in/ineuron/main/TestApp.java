package in.ineuron.main;

import java.io.IOException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import in.ineuron.component.A;
import in.ineuron.component.B;

public class TestApp {
	public static void main(String[] args) throws IOException {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/config/applicationContext.xml");
		System.out.println("******** CONTAINER STARTED *********");
		System.in.read();
		
		A a = factory.getBean("a1",A.class);
		System.out.println(a);
		
		B b = factory.getBean("b1",B.class);
		System.out.println(b);
		System.out.println("\n******** CONTAINER STOPPED *********");
		
		
	}	
}

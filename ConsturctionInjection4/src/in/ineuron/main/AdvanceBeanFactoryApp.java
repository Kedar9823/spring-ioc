package in.ineuron.main;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.component.Student;

public class AdvanceBeanFactoryApp {
	public static void main(String[] args) throws IOException {
		
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("in/ineuron/config/applicationContext.xml");
		
		Student std3 = factory.getBean("std3",Student.class);
		
		System.out.println("AdvanceBeanFactoryApp.main():: "+std3);
	}
}

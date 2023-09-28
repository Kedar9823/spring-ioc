package in.ineuron.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import in.ineuron.component.Student;

@SuppressWarnings("deprecation")
public class MainApp {
	public static void main(String[] args) {
		FileSystemResource file = new FileSystemResource("src/in/ineuron/config/applicationContext.xml");
		
		XmlBeanFactory factory = new XmlBeanFactory(file);
		
		Student std1 = factory.getBean("std1",Student.class);
		System.out.println("\nStudent1: "+std1);
		
		Student std2 = factory.getBean("std2",Student.class);
		System.out.println("\nStudent2: "+std2);
		
		Student std3 = factory.getBean("std3",Student.class);
		System.out.println("\nStudent3: "+std3);
		
		Student std4 = factory.getBean("std4",Student.class);
		System.out.println("\nStudent4: "+std4);
	}
}

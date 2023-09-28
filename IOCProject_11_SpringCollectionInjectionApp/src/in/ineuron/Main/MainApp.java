package in.ineuron.Main;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.College;
import in.ineuron.component.ContactInfo;
import in.ineuron.component.MarksInfo;
import in.ineuron.component.UniversityInfo;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		System.out.println("\nBeans: "+Arrays.toString(context.getBeanDefinitionNames()));
		
		MarksInfo marks= context.getBean("marksinfo",MarksInfo.class);
		System.out.println("\nMarks: "+marks);
		
		College college= context.getBean("clg",College.class);
		System.out.println("\nCollege: "+college);
		
		ContactInfo contact= context.getBean("contactinfo",ContactInfo.class);
		System.out.println("\nContact: "+contact);
		
		UniversityInfo uni = context.getBean("uni1",UniversityInfo.class);
		System.out.println("\nUniversityInfo: "+uni);
	}
}

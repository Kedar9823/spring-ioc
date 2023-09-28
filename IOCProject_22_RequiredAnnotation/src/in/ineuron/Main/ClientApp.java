package in.ineuron.Main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.PersonInfo;



public class ClientApp {
	public static void main(String[] args) throws Exception
	{

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		PersonInfo personInfo = context.getBean(PersonInfo.class);
		System.out.println("personInfo:: "+personInfo);
		((AbstractApplicationContext)context).close();
	}
}

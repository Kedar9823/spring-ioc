package in.ineuron.Main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.Employee;


public class ClientApp {
	public static void main(String[] args) throws Exception
	{

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		
		System.out.println("Beans:: "+context.getBeanDefinitionCount());
		
		((AbstractApplicationContext)context).close();
	}
}

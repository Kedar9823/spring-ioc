package in.ineuron.Main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.Flipkart;




public class ClientApp {
	public static void main(String[] args) throws Exception
	{

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		Flipkart flipKart = context.getBean(Flipkart.class);
		System.out.println(flipKart.doShopping(new String[] {"tissot","omegha"}, new float[] {35000.46f,60000.50f}));
		
		((AbstractApplicationContext)context).close();
	}
}

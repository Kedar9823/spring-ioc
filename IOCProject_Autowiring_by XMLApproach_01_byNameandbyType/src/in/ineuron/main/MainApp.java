package in.ineuron.main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.FlipKart;

public class MainApp{
	public static void main(String[] args) throws IOException {
		ApplicationContext context = new  ClassPathXmlApplicationContext("in/ineuron/config/applicationContext.xml");
		System.out.println("\n******** CONTAINER STARTED *********");
		System.in.read();
		
		FlipKart flip = context.getBean("fpkt",FlipKart.class);
		System.out.println("FlipKart delivery service:: "+flip);
		Random ran1 = new Random();
		Random ran2 = new Random();
		Float price1 = ran1.nextFloat(10000.0f);
		Float price2 = ran2.nextFloat(20000.0f);
		String result = flip.doShopping(new String[] {"fossils","tissot"},new Float[] {price1, price2});
		System.out.println(result);
		System.out.println("Beans: "+Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println("\n******** CONTAINER STOPPED *********");
		((AbstractApplicationContext) context).close();
		
	}	
}

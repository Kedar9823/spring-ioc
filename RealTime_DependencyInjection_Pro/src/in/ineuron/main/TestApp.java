package in.ineuron.main;

import java.io.IOException;
import java.util.Random;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import in.ineuron.component.FlipKart;

public class TestApp {
	public static void main(String[] args) throws IOException {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/config/applicationContext.xml");
		System.out.println("******** CONTAINER STARTED *********");
		System.in.read();
		
		FlipKart flip = factory.getBean("fpkt",FlipKart.class);
		System.out.println("FlipKart delivery service:: "+flip);
		Random ran1 = new Random();
		Random ran2 = new Random();
		Float price1 = ran1.nextFloat(10000.0f);
		Float price2 = ran2.nextFloat(20000.0f);
		String result = flip.doShopping(new String[] {"fossils","tissot"},new Float[] {price1, price2});
		System.out.println(result);
		System.out.println("******** CONTAINER STOPPED *********");
		
		
	}	
}

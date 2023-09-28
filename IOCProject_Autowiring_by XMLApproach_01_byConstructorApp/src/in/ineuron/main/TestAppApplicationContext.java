
package in.ineuron.main;

import java.io.IOException;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.component.FlipKart;

public class TestAppApplicationContext {
	public static void main(String[] args) throws IOException {		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/config/applicationContext.xml");
		System.out.println("******** CONTAINER STARTED *********");
		System.in.read();
		
		FlipKart flip = context.getBean("fpkt",FlipKart.class);
		System.out.println("FlipKart delivery service:: "+flip);
		String result = flip.doShopping(new String[] {"fossils","tissot"},new Float[] {25000.0f, 32000.02f});
		System.out.println(result);
		System.out.println("******** CONTAINER STOPPED *********");
		context.close();
		
	}	
}

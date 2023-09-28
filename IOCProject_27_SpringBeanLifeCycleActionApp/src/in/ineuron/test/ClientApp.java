package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClientApp {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("Bean id information :: " + Arrays.toString(context.getBeanDefinitionNames()));

		((AbstractApplicationContext) context).close();
	}
}

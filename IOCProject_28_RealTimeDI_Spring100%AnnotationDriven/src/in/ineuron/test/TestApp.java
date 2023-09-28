package in.ineuron.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ineuron.cfg.ConfigApp;
import in.ineuron.controller.MainController;

public class TestApp {

	private static AnnotationConfigApplicationContext annotationConfigApplicationContext;

	public static void main(String[] args) throws Exception {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
	
		System.out.println("\n**************** Container Started ****************\n");
		
		MainController app = context.getBean(MainController.class);
	
		System.out.println("\nBeans: "+Arrays.toString(context.getBeanDefinitionNames()));
		
		System.out.println("\n"+app);

		System.out.println("\n**************** Container Stopped ****************");
		
		context.close();
	}

}

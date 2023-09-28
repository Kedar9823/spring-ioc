package in.ineuron.main;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.controller.MainController;
import in.ineuron.vo.CustomerVO;

public class MainApp {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the CustomerName:: "); 
		String customerName = scanner.next();
		System.out.println("Enter the CustomerAddress:: "); 
		String customerAddress = scanner.next();
		System.out.println("Enter the CustomerpAmt:: "); 
		String customerpAmt = scanner.next();
		System.out.println("Enter the InterestRate:: "); 
		String interestRate = scanner.next();
		System.out.println("Enter the duration:: "); 
		String duration = scanner.next();
		
		CustomerVO customerVO = new CustomerVO(); 
		customerVO.setCustomerName(customerName);
		customerVO.setCustomerAddress(customerAddress);
		customerVO.setpAmt(customerpAmt);
		customerVO.setRate(interestRate);
		customerVO.setTime(duration);
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/config/applicationContext.xml");
		System.out.println("\n*********** Container Starting ***********\n");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));		
		MainController controller = context.getBean(MainController.class);
		String result = controller.processCustomer(customerVO);
		System.out.println("Output:: "+result);
		System.out.println("\n*********** Container Stopped ***********");
	}
}

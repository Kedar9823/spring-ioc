package in.ineuron.Main;

import java.util.Date;

import in.ineuron.component.WishMessageGenerator;

public class UsingCoreJavaApp {
	public static void main(String[] args) {

		WishMessageGenerator generator = new WishMessageGenerator();
		java.util.Date date = new Date();
		System.out.println("Dependent Object is:: "+date);
		System.out.println("Target Object before Setter Injection:: "+generator);
		generator.setDate(date);
		
		System.out.println("Target Object after Setter Injection:: "+generator);

		String result = generator.generateMessage("Sachin");
		System.out.println("Result: "+result);
	}
}

package in.ineuron.main;

import java.util.Date;

import in.ineuron.component.WishMessageGenerator;

public class UsingCoreJavaApp {
	public static void main(String[] args) {
		Date date = new java.util.Date();
		System.out.println("Creating an Object of Dependant class using Zero param Constructor");
		
		WishMessageGenerator wmg = new WishMessageGenerator(date);
		
		System.out.println(wmg.generateMessage("K"));
	}
}

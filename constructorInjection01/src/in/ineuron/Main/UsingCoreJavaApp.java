package in.ineuron.Main;


import in.ineuron.component.WishMessageGenerator;

public class UsingCoreJavaApp {
	public static void main(String[] args) {

		java.util.Date date = new java.util.Date();
		System.out.println("Creating an Object Dependent class using Zero param constructor:: "+date);
		
		WishMessageGenerator wmg = new WishMessageGenerator(date);
		System.out.println("\nCreating an object of Target class using parameterise constructor:: "+wmg);
		String result = wmg.generateMessage("Kohli");
		System.out.println("\nResult: "+result);
	}
}

package in.ineuron.component;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//Target Object
public class Flipkart {

	private Courier courier;
	
	static {
		System.out.println("\nFlipkart.class file is loading...");
	}

	public Flipkart(@Qualifier("bDart") Courier courier) {
		this.courier = courier;
		System.out.println("FlipKart:: One Param Constructor...");
		System.out.println(this);
	}

	// Business logic
	public String doShopping(String[] items, float prices[]) {
		System.out.println("Flipkart.doShopping()");
		System.out.println("Implementation class is :: " + courier.getClass().getName());

		int oid = 0;
		float billAmt = 0.0f;
		Random random = null;
		for (float price : prices) {
			billAmt += price;
		}
		random = new Random();
		oid = random.nextInt(1000);
		System.out.println("Order id is :: " + oid);
		String msg = courier.deliver(oid);
		return Arrays.toString(items) + " are purchased having prices  " + Arrays.toString(prices)
				+ " with billAmount of " + billAmt + "----->" + msg;
	}

	@Override
	public String toString() {
		return "Flipkart [courier=" + courier + "]";
	}

}

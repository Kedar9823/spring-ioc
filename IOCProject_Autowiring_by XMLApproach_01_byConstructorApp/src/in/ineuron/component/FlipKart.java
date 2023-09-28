package in.ineuron.component;

import java.util.Arrays;
import java.util.Random;

public class FlipKart {

	private Courier courier;
	private Float discount;

	static {
		System.out.println("FlipKart.class file is loading");
	}

	public FlipKart() {
		System.out.println("FlipKart object instantiated using zero param constructor...");
	}

	public FlipKart(Courier courier, Float discount) {
		this.courier = courier;
		this.discount = discount;
		System.out.println("FlipKart: 2 param constructor");
		System.out.println(this);
	}

	public String doShopping(String items[], Float[] floats) {
		System.out.println("FlipKart.doShopping()");
		System.out.println("Implementing class is: " + courier.getClass().getName());
		System.out.println("Discount Amount: " + discount);

		Float billAmount = 0.0f;
		for (Float price : floats) {
			billAmount += price;
		}
		billAmount = billAmount - (discount/100.0f);
		Random random = new Random();
		int oid = random.nextInt(1000);
		String msg = courier.delivery(oid);
		return "\nList of Items: " + Arrays.toString(items)
				+ " \nPurchased with amount: " + Arrays.toString(floats) + "\nTotal bill: " + billAmount + "\n" + msg+"\n";
	}

	@Override
	public String toString() {
		return "FlipKart [courier=" + courier + ", discount=" + discount + "]";
	}

}

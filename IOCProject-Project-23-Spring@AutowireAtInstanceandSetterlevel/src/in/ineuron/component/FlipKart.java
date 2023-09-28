package in.ineuron.component;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FlipKart {

//  Field Level
	@Autowired
	@Qualifier("ff")
	private Courier courier;

	private Float discount;

	static {
		System.out.println("FlipKart.class file is loading");
	}

	public FlipKart() {
		System.out.println("FlipKart object instantiated using zero param constructor...");
	}

//  Setter Level	
//	@Autowired
//	public void setCourier(@Qualifier("ff") Courier courier) {
//		this.courier = courier;
//		System.out.println("FlipKart.setCourier()");
//		System.out.println(this);
//	}
	
	public void setCourier(Courier courier) {
		this.courier = courier;
		System.out.println("FlipKart.setCourier()");
		System.out.println(this);
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
		System.out.println("FlipKart.setDiscount()");
		System.out.println("Discount: " + discount);
		System.out.println(this);
	}

	public String doShopping(String items[], Float[] floats) {
		System.out.println("FlipKart.doShopping()");
		//System.out.println("Implementing class is: " + courier.getClass().getName());
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

package in.ineuron.component;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="singleton")
@PropertySource(value="/in/ineuron/commons/application.properties")
public class FlipKart {

	@Autowired
	private Courier courier;

	@Value("${flipkart.info.discount}")
	private Float discount;

	static {
		System.out.println("FlipKart.class file is loading");
	}

	public FlipKart(Courier courier) {
		this.courier = courier;
		System.out.println("FlipKart:: One Params constructor");
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

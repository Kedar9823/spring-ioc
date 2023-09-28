package in.ineuron.component;

import java.util.Date;

//Target Class (UserDefined => WishMessageGenerator)
public class WishMessageGenerator {
	
	//Dependant class (Predefined => java.util.Date)
	private Date date;
	
	static {
		System.out.println("\nWishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: Zero Parameter Constructor");
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator:: One Parameter Constructor");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator:: Using Setter");
		this.date = date;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
}

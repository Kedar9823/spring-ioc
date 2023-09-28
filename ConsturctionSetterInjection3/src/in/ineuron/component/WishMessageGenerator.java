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
		System.out.println("WishMessageGenerator object instantiated...");
	}

	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator object instantiated using one param constructor...");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("\nSetter Injection is called to inject depend Object through setter method");
		this.date = date;
	}

	// Business Logic
	public String generateMessage(String userName) {
		int hour = date.getHours();
		String msg;
		if(hour<12) {
			//return "Good Morning:: "+userName;
			msg = "Good Morning:: "+userName;
		}
		else if(hour < 16) {
			//return "Good Afternoon:: "+userName;
			msg =  "Good Afternoon:: "+userName;
		}
		else if(hour <20) {
			//return "Good Evening:: "+userName;
			msg = "Good Evening:: "+userName;
		}
		else {
			msg = "Good Morning:: "+userName;
		}
		return msg;
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
}

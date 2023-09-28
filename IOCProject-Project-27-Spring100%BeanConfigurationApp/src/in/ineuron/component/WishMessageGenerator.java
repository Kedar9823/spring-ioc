package in.ineuron.component;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="wmg")
public class WishMessageGenerator {

	@Autowired(required = true)
	@Qualifier(value="date1")
	private LocalDateTime date;
	
	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: Zero param constructor instantiated...");
	}
	
	public String generateMessage(String userName) {
		int hour = date.getHour();
		if (hour<12) {
			return "Good Morning:: "+userName;
		} 
		else if(hour<16) {
			return "Good Afternoon:: "+userName;
		}
		else if(hour<16) {
			return "Good Evening:: "+userName;
		}
		else {
			return "Good Night:: "+userName;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}
}

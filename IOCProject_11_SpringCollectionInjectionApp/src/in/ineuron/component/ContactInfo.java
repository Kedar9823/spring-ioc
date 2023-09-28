package in.ineuron.component;

import java.util.Date;
import java.util.Set;

public class ContactInfo {

	private Set<Long> contactNumbers;
	private Set<Date> dates;
	
	public void setContactNumbers(Set<Long> contactNumbers) {
		this.contactNumbers = contactNumbers;
	}
	public void setDates(Set<Date> dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "ContactInfo [contactNumbers=" + contactNumbers + ", dates=" + dates + "]";
	}
	
}

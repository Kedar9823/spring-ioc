package in.ineuron.component;

import java.util.Date;
import java.util.List;

public class College {
	
	private List<String> studentNames;
	private List<Date> dob;
	
	public College() {}

	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	public void setDob(List<Date> dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "College [studentNames=" + studentNames + ", dob=" + dob + "]";
	}
	
}

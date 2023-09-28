package in.ineuron.component;

import java.util.Set;

public class EnggCourse {
	private Set<String> courses;

	
//	public void setCourses(Set<String> courses) {
//		this.courses = courses;
//	}
	
	
	public EnggCourse(Set<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "EnggCourse [courses=" + courses + "]";
	}


	
	
}

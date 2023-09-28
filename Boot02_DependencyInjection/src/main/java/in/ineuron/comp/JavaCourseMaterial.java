package in.ineuron.comp;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseMaterial implements ICourse{

	static {
		System.out.println("JavaCourseMaterial.class file is loading...");
	}

	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial:: Zero Param constructor...");
	}
	
	
	
}

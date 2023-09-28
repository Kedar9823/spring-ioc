package in.ineuron.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="bDart")
public class BlueDart implements Courier {

	static {
		System.out.println("BlueDart.class file is loading...");
	}
	
	public BlueDart() {
		System.out.println("BlueDart:: Zero param Connstructor");
	}
	
	@Override
	public String delivery(int oid) {
		return "BlueDart delivery Id: "+oid;
	}

}

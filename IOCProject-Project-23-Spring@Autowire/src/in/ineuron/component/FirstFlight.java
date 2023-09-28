package in.ineuron.component;

public class FirstFlight implements Courier {

	static {
		System.out.println("FirstFlight.class file is loading...");
	}

	public FirstFlight() {
		System.out.println("FirstFlight:: Zero param Connstructor");
	}
	
	@Override
	public String delivery(int oid) {
		return "FirstFlight delivery Id: "+oid;
	}

}

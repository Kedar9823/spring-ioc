package in.ineuron.component;

public class Delhivery implements Courier {

	static {
		System.out.println("Delhivery.class file is loading...");
	}
	
	public Delhivery() {
		System.out.println("Delhivery:: Zero param Connstructor");
	}

	@Override
	public String delivery(int oid) {
		return "Delhivery delivery Id: "+oid;
	}

}

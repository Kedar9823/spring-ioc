package in.ineuron.component;

public class DTDC implements Courier {

	static {
		System.out.println("DTDC.class file is loading...");
	}
	
	public DTDC() {
		System.out.println("DTDC:: Zero param Connstructor");
	}
	
	@Override
	public String delivery(int oid) {
		return "DTDC delivery Id: "+oid;
	}

}

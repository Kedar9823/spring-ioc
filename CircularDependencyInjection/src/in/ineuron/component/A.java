package in.ineuron.component;

public class A {
	private B b;

	static {
		System.out.println("A class file loading...");
	}
	
	public A() {
		System.out.println("A class with zero param constructor...");
	}
	
	public A(B b) {
		this.b = b;
		System.out.println("A class with one param constructor...");
	}

	public void setB(B b) {
		this.b = b;
		System.out.println("A.setB()");
	}
}

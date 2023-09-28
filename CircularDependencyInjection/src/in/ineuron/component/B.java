package in.ineuron.component;

public class B {
	private A a;
	
	static {
		System.out.println("B class file is loading...");
	}

	public B() {
		System.out.println("B class with zero param constructor...");
	}

	public B(A a) {
		this.a = a;
		System.out.println("B class with one param constructor...");
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("B.setA()");
	}
	
	
}

package in.ineuron.dto;

public class CustomerDTO {
	private String customerName;
	private String customerAddress;

	private Float  pAmt;
	private Float rate;
	private Float time;
	
	static {
		System.out.println("CustomerDto class file loading...");
	}
	
	public CustomerDTO() {
		System.out.println("CustomerDto class instantiated...");
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setpAmt(Float pAmt) {
		this.pAmt = pAmt;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	
	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public Float getpAmt() {
		return pAmt;
	}

	public Float getRate() {
		return rate;
	}

	public Float getTime() {
		return time;
	}

	@Override
	public String toString() {
		return "CustomerDTO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pAmt=" + pAmt
				+ ", rate=" + rate + ", time=" + time + "]";
	}
	
}

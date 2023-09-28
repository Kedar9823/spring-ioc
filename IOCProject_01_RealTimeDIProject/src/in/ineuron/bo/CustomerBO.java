package in.ineuron.bo;

public class CustomerBO {
	
	private String customerName;
	private String customerAddress;

	private Float  pAmt;
	private Float rate;
	private Float time;
	private Float interestAmount;
	
	static {
		System.out.println("CustomerBO class file loading...");
	}
	
	public CustomerBO() {
		System.out.println("CustomerBO class instantiated");
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

	public void setInterestAmount(Float interestAmount) {
		this.interestAmount = interestAmount;
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

	public Float getInterestAmount() {
		return interestAmount;
	}

	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", customerAddress=" + customerAddress + ", pAmt=" + pAmt
				+ ", rate=" + rate + ", time=" + time + ", interestAmount=" + interestAmount + "]";
	}
}	
	 
	
	

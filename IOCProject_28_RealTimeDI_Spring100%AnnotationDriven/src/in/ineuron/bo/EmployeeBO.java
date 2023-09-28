package in.ineuron.bo;

public class EmployeeBO {
	private String eid;
	private String ename;
	private String eage;
	private String eadress;
	private String esalary;
	private String hikeAmt;

	static {
		System.out.println("EmployeeBO.class file loading...");
	}

	public EmployeeBO() {
		System.out.println("EmployeeBO Zero param constructor");
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEage() {
		return eage;
	}

	public void setEage(String eage) {
		this.eage = eage;
	}

	public String getEadress() {
		return eadress;
	}

	public void setEadress(String eadress) {
		this.eadress = eadress;
	}

	public String getEsalary() {
		return esalary;
	}

	public void setEsalary(String esalary) {
		this.esalary = esalary;
	}

	public String getHikeAmt() {
		return hikeAmt;
	}

	public void setHikeAmt(String hikeAmt) {
		this.hikeAmt = hikeAmt;
	}

	@Override
	public String toString() {
		return "EmployeeBO [eid=" + eid + ", ename=" + ename + ", eage=" + eage + ", eadress=" + eadress + ", esalary="
				+ esalary + ", hikeAmt=" + hikeAmt + "]";
	}

}

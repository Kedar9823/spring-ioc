package in.ineuron.comp;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component(value="voter")
public class Voter {
	private String name;
	private float age;
	private Date dov;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public Date getDov() {
		return dov;
	}
	public void setDov(Date dov) {
		this.dov = dov;
	}

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}
	
}

package in.ineuron.component;

import java.nio.channels.IllegalChannelGroupException;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.sun.xml.internal.bind.v2.runtime.Name;

@Component(value="voter")
@PropertySource(value="in/ineuron/commons/application.properties")
public class Voter {
	
	@Value("${voter.info.name}")
	private String voterName;
	@Value("${voter.info.age}")
	private Integer age;
	private Date dov;

	static {
		System.out.println("\nVoter.class file loading...");
	}
	
	public Voter() {
		System.out.println("Voter class instantiated...");
		System.out.println(this);
	}

	@PostConstruct
	public void init() {
		System.out.println("Voter.init()");
		dov = new Date();
		boolean flag = false;
		if(voterName == null)
			flag = true;
		if(age<=0)
			age = age * -1;
		if(flag)
			throw new IllegalArgumentException("Invalid inputs");
	}
	
	public String votingEligibility() {
		
		if(age>=18)
			return "Voter is eligible to vote";
		else
			return "Voter is not eligible to vote";
	}
	
	@PreDestroy
	public void destoryBean() {
		System.out.println("\nVoter.destoryBean()");
		voterName = null;
		age = null; 
		dov = null; 
	}
	
	@Override
	public String toString() {
		return "Voter [voterName=" + voterName + ", age=" + age + ", dov=" + dov + "]";
	}
	
	
}

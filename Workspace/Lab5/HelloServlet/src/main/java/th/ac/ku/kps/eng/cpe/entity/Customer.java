package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;
import java.util.List;

public class Customer implements Serializable{
	private String name;
	List<PhoneNumber> number;
	
	public Customer (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PhoneNumber> getPhoneNumbers() {
		return number;
	}
}
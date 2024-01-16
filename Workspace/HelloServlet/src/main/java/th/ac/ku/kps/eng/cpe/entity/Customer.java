package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;
//import javax.servlet.http.HttpServlet;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;




public class Customer implements Serializable
{
	@JsonProperty("dee")
	private String name;
	private ArrayList<PhoneNumber> phoneNumbers; 
	
	
	public Customer() {
		phoneNumbers = new ArrayList<PhoneNumber>(); 
	}
	public Customer(String s) {
		this.name = s;
		phoneNumbers = new ArrayList<PhoneNumber>(); 
	}
	
	
	public String getName() {
		return this.name;
	}

	
	public void setName(String s) {
		this.name = s;
	}
	

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	
}
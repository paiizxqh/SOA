package th.ac.ku.kps.eng.cpe.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneNumber implements Serializable{
	@JsonProperty
	private String number;
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PhoneNumber() {
		
	}
	
	public PhoneNumber(String s) {
		this.number = s;
	}
	
	

}

public class PhoneNumber {
	private String number;

	public PhoneNumber() {} // ไม่รับพารามิเตอร์
	
	public PhoneNumber(String number) {
		this.number = number;
	}
	
// Getter & Setter
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

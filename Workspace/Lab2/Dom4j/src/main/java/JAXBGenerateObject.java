import java.io.*;
import java.util.ArrayList;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JAXBGenerateObject {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("customer-jaxb.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Unmarshaller  jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer cus = (Customer) jaxbUnmarshaller.unmarshal(is);
			System.out.println("Customer Name : " + cus.getName());
			
			ArrayList<PhoneNumber> phoneList = (ArrayList<PhoneNumber>)cus.getPhoneNumbers();
				for(PhoneNumber p : phoneList) {
					System.out.println("Phone Number Id : " + p.getNumber());
				}
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
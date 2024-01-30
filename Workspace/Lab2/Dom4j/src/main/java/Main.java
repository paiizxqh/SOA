import java.io.File;
import java.io.IOException;

import org.xml.sax.SAXException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Main {

	public Main() {}

	public static void main(String[] args) throws JAXBException, SAXException, IOException {
		Customer customer = new Customer();
		customer.setName("Jane Doe");
		customer.getPhoneNumbers().add(new PhoneNumber("12345"));
		customer.getPhoneNumbers().add(new PhoneNumber("222"));
		JAXBContext jc = JAXBContext.newInstance(Customer.class);
		
		Marshaller m = jc.createMarshaller();
		
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		m.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
		m.setProperty(Marshaller.JAXB_SCHEMA_LOCATION,"\"http://localhost:8080/xml/http://localhost:8080/xml/customer.xsd");
		m.marshal(customer, System.out);
		m.marshal(customer, new File("customer-jabx.xml"));
	}

}

import java.io.File;
import java.io.IOException;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;

public class MainXSD {

	public static void main(String[] args) throws IOException, JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
		SchemaOutputResolver sor = new SchemaOutputResolver() {

			public Result createOutput(String namespaceURI, String suggestedFileName) throws IOException {
				File file = new File("customer.xsd");
				StreamResult result = new StreamResult(file);
				result.setSystemId(file.toURI().toURL().toString());
				return result;
			}
		}; jaxbContext.generateSchema(sor);
	}
}

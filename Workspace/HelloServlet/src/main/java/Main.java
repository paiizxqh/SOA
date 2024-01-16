import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import th.ac.ku.kps.eng.cpe.dao.CustomerDAO;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		CustomerDAO c = new CustomerDAO();

		ObjectMapper obj = new ObjectMapper();
		//obj.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		System.out.println(obj.writeValueAsString(c.getAllCustomers()));
	}

}

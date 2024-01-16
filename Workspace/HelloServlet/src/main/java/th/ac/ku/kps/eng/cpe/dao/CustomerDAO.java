package th.ac.ku.kps.eng.cpe.dao;
import java.io.Serializable;
import java.util.ArrayList;

import th.ac.ku.kps.eng.cpe.entity.Customer; 

public class CustomerDAO implements Serializable{

	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}
		public static ArrayList<Customer> getAllCustomers(){
			
			ArrayList<Customer> listOfCustomers = new ArrayList<>();
			
			Customer c1 = new Customer ("Mr.Smith"); 
			Customer c2 = new Customer ("Mrs.Smith");
			
			listOfCustomers.add(c1);
			listOfCustomers.add(c2);
			
			return listOfCustomers;
	}

}


package utils;

import java.util.List;
import com.app.core.*;

import custom_exceptions.*;

public class CustomerUtils {
	public static Customer findByEmailPassword(String email,String password,List<Customer> custList) throws CustomerHandlingExceptions {
		
		Customer cust = new Customer(email);
		int index = custList.indexOf(cust);
		
		if (index == -1) // => not found !
			throw new CustomerHandlingExceptions("Invalid email");
		if(!((custList.get(index).getPassword()).equals(password)))
			throw new CustomerHandlingExceptions("Invalid Password");
		else		
		    return custList.get(index);
	}
	
}

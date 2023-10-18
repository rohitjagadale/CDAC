package utils;
import com.app.core.*;
import custom_exceptions.CustomerHandlingExceptions;

import java.time.LocalDate;
import java.util.List;

public class CustomerValidationRules {
	
	public static void checkDuplicateCustomer(String email,List<Customer> cust)throws CustomerHandlingExceptions {
		Customer c1 = new Customer(email);
		if(cust.contains(c1))
			throw new CustomerHandlingExceptions("Customer cannot added due to duplicate email");
		System.out.println("No duplicates");
	}
	
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	public static double validateRegAmount(double amount,ServicePlan plan)throws CustomerHandlingExceptions {
		
		if(plan.getCharges()==amount)
			return amount;
		else
			throw new CustomerHandlingExceptions("Registered amount doesn't match with "+plan.name()+" plans charges "+plan.getCharges());
			
		
	}
	
	public static Customer validateAll(String firstName, String lastName, String custEmail, String custPass,
			double amount, String dateOfBirth, String plan,List<Customer> custList) 
					throws CustomerHandlingExceptions,IllegalArgumentException 
	{
		checkDuplicateCustomer(custEmail, custList);
		ServicePlan sPlan = validatePlan(plan);
		double registrationAmount = validateRegAmount(amount,sPlan);
		LocalDate bDate = LocalDate.parse(dateOfBirth);
		return new Customer(firstName, lastName, custEmail, custPass, registrationAmount, bDate, sPlan);
	}
}

package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static utils.CustomerValidationRules.validateAll;
import static utils.CustomerUtils.findByEmailPassword;

import com.app.core.Customer;

import custom_exceptions.CustomerHandlingExceptions;

public class CustomerManagement {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
		List<Customer> customers = new ArrayList<>();
		boolean exit = false;
		while(!exit) {
			System.out.println("Options :\n"+"1. Sign up (customer registration)\n"+"2. Sign in (login)\n"+"3. Change password\n"+
								"4. Un subscribe customer\n"+"5. Display all customers\n"+"0. Exit\n" );
			try {
			switch(sc.nextInt()) {
				case 1://Sign Up
					System.out.println("Enter the customer details : firstName, lastName, email, "
							+ "password, register amount, bith date(yyyy-MM-dd), service plan ");
					Customer cust = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
							sc.nextDouble(), sc.next(), sc.next(), customers);
					//Customer cust = validateAll("abc", "xyz", "abc@gmail", "abc123", 2000.0, "2000-01-21", "gold",customers);
					System.out.println("Customer is added");
					customers.add(cust);
					break;
					
				case 2://Sign in (login)
					System.out.println("Enter email and password of a customer");
					Customer c1 = findByEmailPassword(sc.next(),sc.next(),customers);
					System.out.println("Customer signed in successfully");
					System.out.println(c1);
					break;
					
				case 3://Change password
					System.out.println("Enter email and password of a customer");
					c1 = findByEmailPassword(sc.next(),sc.next(),customers);
					System.out.println("Customer signed in successfully and now you can change the passowrd");
					System.out.println("Enter the new password :");
					c1.setPassword(sc.next());
					System.out.println("New passowrd is updated successfully");
					break;
					
				case 4://Un subscribe customer
					System.out.println("Enter an email to un-subscribe the customer :");
					c1 = new Customer(sc.next());
					if(customers.remove(c1))
						System.out.println("Customer is un-subscribed");
					else
						throw new CustomerHandlingExceptions("Customer is not un-subscribed : Invalid email");
					break;
					
				case 5:
					System.out.println("Customer Deatils");
					for(Customer c: customers) {
						System.out.println(c);
					}
					break;
					
				case 0:
					exit =true;
					System.out.println("Exit!!!!");
					break;
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		}
	}

}

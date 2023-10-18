package com.app.core;

import java.time.LocalDate;

public class Customer {
	
	private int customerID;
	private String firstName;
	private String lastName;
	private String custEmail;
	private String custPassword;;
	private double registrationAmount;
	private LocalDate dateOfBirth;
	private static int idCounter;
	private ServicePlan plan;//ref of enum
	static {
		idCounter = 100;
	}
	public Customer(String firstName, String lastName, String custEmail, String custPassword,
			double registrationAmount, LocalDate dateOfBirth, ServicePlan plan) {
		super();
		this.customerID = idCounter++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.custEmail = custEmail;
		this.custPassword = custPassword;
		this.registrationAmount = registrationAmount;
		this.dateOfBirth = dateOfBirth;
		this.plan = plan;
	}
	
	public Customer (String email) {
		this.custEmail = email;
	}
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", custEmail=" + custEmail + ", custPassword=" + custPassword + ", registrationAmount=" + registrationAmount
				+ ", dateOfBirth=" + dateOfBirth + ", plan=" + plan + "]";
		
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer) {
			Customer anotherCustomer = (Customer)o;
			return custEmail.equals(anotherCustomer.custEmail);
		}
			
		return false;
	}
	
	public String getPassword() {
		return custPassword;
	}
	
	public void setPassword(String password) {
		custPassword = password;
	}
	
	
}

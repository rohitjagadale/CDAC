package com.app.emp;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee{
	private double basicSalary;

	public PartTimeEmployee(String empName, LocalDate joiningDate, String phoneNo, String aadharNo,double basicSalary) {
		super(empName, joiningDate, phoneNo, aadharNo);
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [" + super.toString() + " + basicSalary " + basicSalary + "]";
	}

}

package com.app.emp;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee{
	private double basicSalary;

	public FullTimeEmployee(String empName, LocalDate joiningDate, String phoneNo, String aadharNo,double basicSalary) {
		super(empName, joiningDate, phoneNo, aadharNo);
		this.basicSalary = basicSalary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [" + super.toString() + " + basicSalary " + basicSalary + "]";
	}

}

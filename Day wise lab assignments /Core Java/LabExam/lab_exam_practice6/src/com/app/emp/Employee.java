package com.app.emp;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String empName;
	private LocalDate joiningDate;
	private String phoneNo;
	private String aadharNo;
	private static int idGenerator;
	
	static {
		idGenerator = 100;
	}
	public Employee(String empName, LocalDate joiningDate, String phoneNo, String aadharNo) {
		this.empId = ++idGenerator;
		this.empName = empName;
		this.joiningDate = joiningDate;
		this.phoneNo = phoneNo;
		this.aadharNo = aadharNo;
	}
	
	
	
	
	
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Employee) {
			Employee anoEmp = (Employee)o;
			return ((empId==anoEmp.empId)&&(aadharNo.equals(anoEmp.aadharNo)));
		}
		return false;
	}






	public LocalDate getJoiningDate() {
		return joiningDate;
	}






	public String getAadharNo() {
		return aadharNo;
	}






	public int getEmpId() {
		return empId;
	}






	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", joiningDate=" + joiningDate + ", phoneNo="
				+ phoneNo + ", aadharNo=" + aadharNo + "]";
	}
	
	

}

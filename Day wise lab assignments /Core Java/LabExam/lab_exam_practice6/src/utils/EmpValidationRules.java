package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Map;
import static java.util.regex.Pattern.*;

import java.time.LocalDate;

import com.app.emp.Employee;

import custom_exceptions.EmployeeHandlingException;

public class EmpValidationRules {
	public static String aadharPattern = "^[0-9]{12}$";
	public static String phonePattern =  "^[0-9]{10}$";

	
//	public static void checkDupEmpID(int eId,Map<Integer,Employee> empMap) throws EmployeeHandlingException {
//		if(empMap.containsKey(eId))
//			throw new EmployeeHandlingException("Duplicate empID found");
//		System.out.println("No Duplicates");
//	}
//	
	public static String validateAaddhar(String aadharNo) throws EmployeeHandlingException {
		if(!(matches(aadharPattern, aadharNo)))
			throw new EmployeeHandlingException("Invalid Aadhar Number!!!");
		return aadharNo;
		
	}
	
	public static String validatePhoneNo(String phoneNo) throws EmployeeHandlingException {
		if(!(matches(phonePattern, phoneNo)))
			throw new EmployeeHandlingException("Invalid Phone Number!!!");
		return phoneNo;
		
	}
	
	public static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}
	
	public static Employee validateAll(String empName, String jDate, String phone, String aadhar) throws EmployeeHandlingException {
		
		LocalDate joiningDate = parseAndValidateDate(jDate);
		String aaddharNo = validateAaddhar(aadhar);
		String phoneNo = validatePhoneNo(phone);
	
		return new Employee(empName, joiningDate, phoneNo, aaddharNo);
	}
	
	
	
	
	
	
}

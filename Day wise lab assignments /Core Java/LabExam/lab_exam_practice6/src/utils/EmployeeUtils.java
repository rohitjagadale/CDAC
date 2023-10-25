package utils;

import java.util.Map;

import com.app.emp.Employee;

import custom_exceptions.EmployeeHandlingException;

public class EmployeeUtils {
	public static Employee findEmpByEmpId(int id,Map<Integer, Employee> eMap) throws EmployeeHandlingException {
		boolean check  = eMap.containsKey(id);
		if(!(check))
			throw new EmployeeHandlingException("Employee not found : Invalid EmpId");
		return eMap.get(id);
	}
	
	public static int findEmpByAadhar(String aadhar,Map<Integer, Employee> eMap) throws EmployeeHandlingException {
//		boolean check  = eMap.containsKey(id);
//		if(!(check))
//			throw new EmployeeHandlingException("Employee not found : Invalid EmpId");
//		return eMap.get(id);
		
		for(Employee e2 : eMap.values()) {
			if((e2.getAadharNo()).equals(aadhar)) {
				return e2.getEmpId();
			}
//			else
//				throw new EmployeeHandlingException("Employee is not found");
		}
		return 0;
	}
}

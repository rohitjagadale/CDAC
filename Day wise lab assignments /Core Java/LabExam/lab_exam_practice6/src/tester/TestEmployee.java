package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static utils.EmpValidationRules.*;
import static utils.EmployeeUtils.*;


import com.app.emp.Employee;
import com.app.emp.FullTimeEmployee;
import com.app.emp.PartTimeEmployee;

import custom_exceptions.EmployeeHandlingException;

public class TestEmployee {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Map<Integer,Employee> empMap = new HashMap<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Options :\n"+"1. Add full time employee\n"
						+ "2. Add part time employee\n"
						+ "3. Delete an employee by Emp Id\n"
						+ "4. Search employee details by Aadhaar number\n"
						+ "5. Display all employee details\n"
						+ "6. Display all employee details sorted by date of joining\n"
						+ "7. Exit\n");
				try {
					switch(sc.nextInt()) {
					case 1://Add full time employee
						System.out.println("Enter empName, joiningDate, phoneNo,  aadharNo, basicSalary of full time employee");
						Employee e1 = new FullTimeEmployee(sc.next(), parseAndValidateDate(sc.next()), validatePhoneNo(sc.next()), 
								           validateAaddhar(sc.next()), sc.nextDouble());
						empMap.put(e1.getEmpId(), e1);
						System.out.println("Full Time Employee is added");
						break;
						
					case 2://Add part time employee
						System.out.println("Enter empName, joiningDate, phoneNo,  aadharNo, basicSalary of part time employee");
						e1 = new PartTimeEmployee(sc.next(), parseAndValidateDate(sc.next()), validatePhoneNo(sc.next()), 
								           validateAaddhar(sc.next()), sc.nextDouble());
						empMap.put(e1.getEmpId(), e1);
						System.out.println("Part Time Employee is added");
						break;
						
					case 3://Delete an employee by Emp Id
						System.out.println("Enter empId of an emloyee");
						Employee e = findEmpByEmpId(sc.nextInt(), empMap);
						System.out.println("Employee is removed");
						System.out.println(empMap.remove(e.getEmpId()));
						break;
						
					case 4://Search employee details by Aadhaar number
						System.out.println("Enter the aadharNo of an employee");
						String aadhar =  validateAaddhar(sc.next());
						int id = findEmpByAadhar(aadhar,empMap);
						if(empMap.containsKey(id)) {
							System.out.println("Employee is found");
							System.out.println(empMap.get(id));
						}
						else
							throw new EmployeeHandlingException("Employee is not found");
			
					
						
						break;
					case 5://Display all employee details
						System.out.println("All Employee Details");
						for(Employee e2:empMap.values()) {
							System.out.println(e2);
						}
						
						
						System.out.println("All Employee Details using lambda");
						empMap.forEach((i,emp)->System.out.println(emp));
						break;
						
					case 6://Display all employee details sorted by date of joining date
						List<Employee> listEmp = new ArrayList(empMap.values());
						Collections.sort(listEmp, (emp1,emp2)-> (emp1.getJoiningDate().compareTo(emp2.getJoiningDate())));
						System.out.println("All Employee Details sorted by date of joining date");
						listEmp.forEach((emp)->System.out.println(emp));
						break;
						
					case 7://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}

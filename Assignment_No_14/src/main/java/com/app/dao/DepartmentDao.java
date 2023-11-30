package com.app.dao;

import java.util.List;

import com.app.pojos.Department;

public interface DepartmentDao {
//add a method to create new dept
//	String addNewDepartment(Department dept);
//
//	// add a method to display dept details ONLY
//	Department getDepartmentDetails(String deptName);
//
//	// add a method to display dept details+emp details
//	Department getDepartmentAndEmpDetails(String deptName);
//
//	// add a method to display dept details+emp details , in a single join query
//	Department getDepartmentAndEmpDetailsJoinFetch(String deptName);
//
//	// add a method to delete dept details
//	String deleteDeptDetails(String deptName);
	
	//add method to display all departments details without employees
	List<Department> getAllDepartments();

}

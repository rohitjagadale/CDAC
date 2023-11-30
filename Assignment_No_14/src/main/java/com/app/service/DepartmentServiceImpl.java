package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepartmentDao;
import com.app.pojos.Department;

@Service
@Transactional //to enable auto tx mgmt support
public class DepartmentServiceImpl implements DepartmentService {
	
	//dependency
	@Autowired
	private DepartmentDao departmentDao;
	@Override
	public List<Department> getAllDepartments() {
		return departmentDao.getAllDepartments();
	}

}

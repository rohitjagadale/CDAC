package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Department;
import com.app.service.DepartmentService;

@Controller
public class DepartmentController {
	//dependency
	@Autowired
	private DepartmentService deptService;
	
	public DepartmentController() {
		System.out.println("In department controller" + getClass());
	}
	
	//add request handling method to send list of dept to view layer
	@RequestMapping("department_list")
	public String displayDepartments(Model modelMap) {
		System.out.println("In display dept" + modelMap); // ={}
		List<Department> allDeptList = deptService.getAllDepartments();
		modelMap.addAttribute("departments",allDeptList);
		return "/list"; //AVN :- /WEB-INF/views/list.jsp => Dispatcher servlet forwards to list.jsp
	}
	
}

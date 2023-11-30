package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department extends BaseEntity {
	@Column(length = 30, unique = true)
	private String name;
	@Column(length = 60)
	private String location;
	// + association property
	// Dept 1--->* Emps
	@OneToMany(mappedBy = "myDept",cascade = CascadeType.ALL,
			orphanRemoval = true/* ,fetch=FetchType.EAGER */) // mandatory o.w : hib throws MappingExc.
	private List<Employee> employees = new ArrayList<>();

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department id "+getId()+"  [name=" + name + ", location=" + location + "]";
	}

	// add helper method to establish a bi dir asso between entities
	public void addEmployee(Employee e) {
		employees.add(e);//Dept --> Emp
		e.setMyDept(this);//Emp --> Dept
	}

	// add helper method to de link a bi dir asso between entities
	public void removeEmployee(Employee e) {
		employees.remove(e);
		e.setMyDept(null);
	}

}

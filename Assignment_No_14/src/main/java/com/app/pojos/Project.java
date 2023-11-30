package com.app.pojos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project extends BaseEntity {
	@Column(length = 100)
	private String title;
	@Column(name = "start_date")
	private LocalDate startDate;
	@Column(name = "end_date")
	private LocalDate endDate;
	// additional property for Project *---->* Emp
	// suppose : Project : owning side , so to customize name of the child table +
	// FK col names
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "projects_emps"
			, joinColumns = @JoinColumn(name = "project_id")
	, inverseJoinColumns = @JoinColumn(name = "emp_id"))
	private Set<Employee> employees = new HashSet<>();

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String title, LocalDate startDate, LocalDate endDate) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Project [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}

	// add helper method to set bi dir asso Project ---> Emp
	public void addEmployee(Employee e) {
		this.employees.add(e);
		e.getProjects().add(this);
	}

	// add helper method to un set bi dir asso Project ---> Emp
	public void removeEmployee(Employee e) {
		this.employees.remove(e);
		e.getProjects().remove(this);
	}
	//for the correct n efficient working of HashSet , override hashCode n equals

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Project))
			return false;
		Project other = (Project) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	

}

package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "emp_adr")
public class Address extends BaseEntity {
	@Column(name = "adr_line1", length = 60)
	private String adrLine1;
	@Column(name = "adr_line2", length = 60)
	private String adrLine2;
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 20)
	private String country;
	@Column(length = 10,name="zip_code")
	private String zipCode;
	// Address 1---->1 Emp
	@OneToOne // (fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id", nullable = false)
	@MapsId // shared PK (emp_id : PK of adr table + FK that refs --> PK of emps table)
	private Employee emp;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String adrLine1, String adrLine2, String city, String state, String country, String zipCode) {
		super();
		this.adrLine1 = adrLine1;
		this.adrLine2 = adrLine2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getAdrLine1() {
		return adrLine1;
	}

	public void setAdrLine1(String adrLine1) {
		this.adrLine1 = adrLine1;
	}

	public String getAdrLine2() {
		return adrLine2;
	}

	public void setAdrLine2(String adrLine2) {
		this.adrLine2 = adrLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Address id" + getId() + " [adrLine1=" + adrLine1 + ", adrLine2=" + adrLine2 + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}

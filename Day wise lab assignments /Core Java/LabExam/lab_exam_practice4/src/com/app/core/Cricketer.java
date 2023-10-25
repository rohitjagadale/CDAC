package com.app.core;

public class Cricketer {
	private String name;
	private int age;
	private String emailId;
	private String phone;
	private int rating;
	
	public Cricketer(String name, int age, String emailId, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.phone = phone;
		this.rating = rating;
	}
	
	public Cricketer(String name) {
		super();
		this.name = name;
	}

	
	

	public String getName() {
		return name;
	}

	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", emailId=" + emailId + ", phone=" + phone + ", rating="
				+ rating + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cricketer) {
			Cricketer c1 = (Cricketer)obj;
			return name.equals(c1.name);
		}
		return false;
	}

}

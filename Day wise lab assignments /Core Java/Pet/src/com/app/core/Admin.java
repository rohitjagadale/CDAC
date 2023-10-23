package com.app.core;

public class Admin {
	private int adminId;
	private String adminPass;
	public Admin(int adminId, String adminPass) {
		super();
		this.adminId = adminId;
		this.adminPass = adminPass;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	
	
}

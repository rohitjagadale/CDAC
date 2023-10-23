package com.app.core;

public enum Status {
	PLACED, IN_PROCESS, COMPLETED;
	
	public String toString() {
		return name();
	}
}

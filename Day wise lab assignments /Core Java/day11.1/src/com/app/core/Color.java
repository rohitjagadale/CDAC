package com.app.core;

public enum Color {
	//public static final Color : 
	WHITE(5000), BLACK(10000), GREY(6500), SILVER(8000);
	//Can you add data memebrs to the enum ? YES
	private int additionalCost;
	//can you add a ctor ? YES
	private Color(int additionalCost) {
		//super(name(),ordinal());
		this.additionalCost = additionalCost;
	}
	//getter n setter	
	public int getAdditionalCost() {
		return additionalCost;
	}
	public void setAdditionalCost(int additionalCost) {
		this.additionalCost = additionalCost;
	}
	//Can you override toString 
	@Override
	public String toString()
	{
		return name()+" with additional cost "+additionalCost;
	}
}

package com.app.core;

public class Pet {
//	Pet ( petId, name, category, unitPrice, stocks)
//	Category is an enum with values like (CAT, DOG, RABBIT, FISH)
//	Example:
//	  petId = 101, name=” Bull Dog”, category= DOG, unitPrice= 1000, stocks=50
//
	private int petId;
	private String name;
	private Category category;
	private double unitPrice;
	private int stocks;
	public Pet(int petId,String name, Category category, double unitPrice, int stocks) {
		super();
		this.petId=petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}
	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]";
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	
	
	
	
	


}

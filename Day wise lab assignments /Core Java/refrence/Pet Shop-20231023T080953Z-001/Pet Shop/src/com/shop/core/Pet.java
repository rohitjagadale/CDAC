package com.shop.core;

public class Pet {

	int petId;
	String name;
	Category category;
	double unitPrice;
	int stocks;
	
	public Pet() {}
	
	public Pet(int petId, String name, Category category, double unitPrice, int stocks)
	{
		super();
		this.petId = petId;
		this.name = name;
		this.category = category;
		this.unitPrice = unitPrice;
		this.stocks = stocks;
	}
	
	

	@Override
	public String toString()
	{
		return "Pet [petId=" + petId + ", name=" + name + ", category=" + category + ", unitPrice=" + unitPrice
				+ ", stocks=" + stocks + "]";
	}



	public int getPetId()
	{
		return petId;
	}

	public void setPetId(int petId)
	{
		this.petId = petId;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public double getUnitPrice()
	{
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice)
	{
		this.unitPrice = unitPrice;
	}

	public int getStocks()
	{
		return stocks;
	}

	public void setStocks(int stocks)
	{
		this.stocks = stocks;
	}
	
	
	
}

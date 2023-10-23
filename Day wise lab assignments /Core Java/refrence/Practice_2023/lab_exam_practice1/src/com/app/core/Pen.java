package com.app.core;

import java.time.LocalDate;

public class Pen {
	private int penID;
	private Brand brands;
	private String color;
	private String inkColor;
	private Material materials;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private double price;
	private double discount;
	private static int idGenerator;
	private static int counter;
	
	static{
		idGenerator = 100;
		counter = 0;
	}
	public Pen(Brand brands, String color, String inkColor, Material materials,int stock, 
			LocalDate stockListingDate,double price) {
		super();
		this.penID = ++idGenerator;
		this.brands = brands;
		this.color = color;
		this.inkColor = inkColor;
		this.materials = materials;
		this.stock = stock;
		this.stockUpdateDate = stockListingDate.plusDays(2);
		this.stockListingDate = stockListingDate;
		this.price = price;
		
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = (discount*price)/100;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getStockListingDate() {
		return stockListingDate;
	}
	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStock() {
		return stock;
	}
	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}
	public int getPenID() {
		return penID;
	}
//	@Override
//	public String toString() {
//		return "Pen [penID=" + penID + ", brands=" + brands + ", color=" + color + ", inkColor=" + inkColor
//				+ ", materials=" + materials + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate
//				+ ", stockListingDate=" + stockListingDate + "]";
//	}
//	
	@Override
	public String toString() {
		return "Pen [penID=" + penID + ", brands=" + brands + ", color=" + color + ", inkColor=" + inkColor
				+ ", materials=" + materials + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate
				+ ", stockListingDate=" + stockListingDate + ", price=" + price + "]";
	}
	
	
	
	
}

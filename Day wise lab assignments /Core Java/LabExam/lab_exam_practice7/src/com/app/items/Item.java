package com.app.items;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import static utils.ItemValidationRules.sdf;
public class Item implements Serializable{
	public double getItemPrice() {
		return itemPrice;
	}

	private String itemCode;
	private String itemDescription;
	private double itemPrice;
	private Date shippingDate;
	
	
	public Item(String itemCode, String itemDescription, double itemPrice, Date shippingDate) {
		super();
		this.itemCode = itemCode;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.shippingDate = shippingDate;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item) {
			Item i1 = (Item)obj;
			return itemCode.equals(i1.itemCode);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemDescription=" + itemDescription + ", itemPrice=" + itemPrice
				+ ", shippingDate=" + sdf.format(shippingDate) + "]";
	}
	
	
}

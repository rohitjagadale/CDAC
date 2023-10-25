package com.app.stocks;

import java.time.LocalDate;

public class Stock {
	private String stockId;
	private String stockName;
	private String companyName;
	private double stockPrice;
	private LocalDate closingDate;
	private int quantity;
	
	
	

	public Stock(String stockId, String stockName, String companyName, double stockPrice, LocalDate closingDate,
			int quantity) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.companyName = companyName;
		this.stockPrice = stockPrice;
		this.closingDate = closingDate;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", companyName=" + companyName
				+ ", stockPrice=" + stockPrice + ", closingDate=" + closingDate + ", quantity=" + quantity + "]";
	}

	
	
	
}

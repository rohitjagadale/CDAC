package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class PaymentOption {
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private PaymentType type;
	@Column(length = 10)
	private String cvv;
	@Column(name="exp_date")
	private LocalDate expDate;
	public PaymentOption() {
		// TODO Auto-generated constructor stub
	}
	public PaymentOption(PaymentType type, String cvv, LocalDate expDate) {
		super();
		this.type = type;
		this.cvv = cvv;
		this.expDate = expDate;
	}
	public PaymentType getType() {
		return type;
	}
	public void setType(PaymentType type) {
		this.type = type;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	@Override
	public String toString() {
		return "PaymentOptions [type=" + type + ", cvv=" + cvv + ", expDate=" + expDate + "]";
	}
	
}

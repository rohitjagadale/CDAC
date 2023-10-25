package com.app.bank;

import java.time.LocalDate;

public class BankStatement {

	private LocalDate transactionDate;
	private String narration;
	private double withdrawalAmount;
	private double depositAmount;
	
	public BankStatement(LocalDate transactionDate, String narration, double withdrawalAmount, double depositAmount) {
		super();
		this.transactionDate = transactionDate;
		this.narration = narration;
		this.withdrawalAmount = withdrawalAmount;
		this.depositAmount = depositAmount;
	}
	
	
	
	
	
	public LocalDate getTransactionDate() {
		return transactionDate;
	}





	public String getNarration() {
		return narration;
	}





	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}





	public double getDepositAmount() {
		return depositAmount;
	}





	@Override
	public String toString() {
		return "BankStatement [transactionDate=" + transactionDate + ", narration=" + narration + ", withdrawalAmount="
				+ withdrawalAmount + ", depositAmount=" + depositAmount + "]";
	}
	
	
	
}

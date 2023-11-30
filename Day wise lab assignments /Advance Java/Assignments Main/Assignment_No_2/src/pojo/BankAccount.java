package pojo;

//id | name | type | bal
public class BankAccount {
	private int acctNo;
	private String customerName;
	private String acType;
	private double balance;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	public int getAcctNo() {
		return acctNo;
	}
	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAcType() {
		return acType;
	}
	public void setAcType(String acType) {
		this.acType = acType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", customerName=" + customerName + ", acType=" + acType + ", balance="
				+ balance + "]";
	}
	

}

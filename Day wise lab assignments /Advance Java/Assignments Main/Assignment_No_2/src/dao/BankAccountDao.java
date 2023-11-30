package dao;

import java.sql.SQLException;

public interface BankAccountDao {
//add a method to transfer funds
	String transferFunds(int srcAcNo, int destAcNo, double amount) throws SQLException;
}

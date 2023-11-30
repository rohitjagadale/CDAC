package dao;

import java.sql.*;
import static utils.DBUtils.*;

public class BankAccountDaoImpl implements BankAccountDao {
	// state
	private Connection cn;
	private CallableStatement cst1;

	// def ctor
	public BankAccountDaoImpl() throws SQLException {
		// open cn
		cn = openConnection();
		cst1 = cn.prepareCall("{?=call transfer_funds_func(?,?,?)}");
		// register OUT param (to tell JVM about JDBC data types of OUT params)
		cst1.registerOutParameter(1, Types.DOUBLE);
		System.out.println("acct dao created...");
	}

	@Override
	public String transferFunds(int srcAcNo, int destAcNo, double amount) throws SQLException {
		// set IN params
		cst1.setInt(2, srcAcNo);
		cst1.setInt(3, destAcNo);
		cst1.setDouble(4, amount);
		// execution : execute because prepareCall/stored fun 
		cst1.execute();
		return "Updated dest bal : " + cst1.getDouble(1) ;
	}

	public void cleanUp() throws SQLException {
		if (cst1 != null)
			cst1.close();
		closeConnection();
		System.out.println("acct dao cleaned up!");
	}

}

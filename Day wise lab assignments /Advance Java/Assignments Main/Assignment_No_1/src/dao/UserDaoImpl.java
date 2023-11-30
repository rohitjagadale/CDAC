package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.*;

import pojos.User;

public class UserDaoImpl implements UserDao {
	//state (fields)
	private Connection connection;
	private PreparedStatement pst1;
	//def ctor
	public UserDaoImpl() throws SQLException{
		// get cn from db utils
		connection=openConnection();
		pst1=connection.prepareStatement("select first_name,last_name,dob,status from users where role=? and dob between ? and ?");
		System.out.println("user dao created!");
	}

	@Override
	public List<User> getSelectedUsers(String role, Date begin, Date end) throws SQLException {
		// set IN params
		pst1.setString(1,role);
		pst1.setDate(2, begin);
		pst1.setDate(3, end);
		//exec query : execQuery() --- RST
		List<User> users=new ArrayList<>();
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
				users.add(new User(rst.getString(1),rst.getString(2)
						,rst.getDate(3),rst.getBoolean(4)));
		}
		return users;//DAO rets populated list of users to tester.
	}
	//clean up 
	public void cleanUp() throws SQLException
	{
		if(pst1 != null)
			pst1.close();
		closeConnection();
		System.out.println("user dao cleaned up !");
	}

}

package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static utils.DBUtils.*;

import pojo.User;

public class UserDaoImpl implements UserDao {
	//state (fields)
	private Connection connection;
	private PreparedStatement pst1;
	private PreparedStatement pstUpdate;
	private PreparedStatement pstSelect;
	//def ctor
	public UserDaoImpl() throws SQLException{
		// get cn from db utils
		connection=openConnection();
		pst1=connection.prepareStatement("select first_name,last_name,dob,status from users where role=? and dob between ? and ?");
		pstUpdate = connection.prepareStatement("update users set status = true where id = ?");
		pstSelect = connection.prepareStatement("select * from users where email = ? and password = ?");
		//? in/out parameter
		//pst1 is precompiled preparsed statement
		System.out.println("user dao created!");
	}

	@Override
	public User voterAuthentication(String email, String password) throws SQLException {
		pstSelect.setString(1, email);
		pstSelect.setString(2, password);
		ResultSet rst = pstSelect.executeQuery();
		if(rst.next()) {
			return new User(rst.getInt(1),rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDate(6), rst.getBoolean(7), rst.getString(8));
		}
		return null;
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
	
	@Override
	public String updateVotingStatus(int id) throws SQLException {
		//set in parameter i.e. id of user
		pstUpdate.setInt(1, id);
		int rowsAffected = pstUpdate.executeUpdate();
		if(rowsAffected == 1)
			return "Voting status updated...";
		return "Voting status updation failed...";
	}
	
	//clean up 
	public void cleanUp() throws SQLException
	{
		if(pst1 != null)
			pst1.close();
		if(pstUpdate != null)
			pstUpdate.close();
		if(pstSelect != null)
			pstSelect.close();
		closeConnection();
		System.out.println("user dao cleaned up !");
	}

}

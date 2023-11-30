package dao;

import static utils.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import pojos.Candidate;

public class CandidateDaoImpl  implements CandidateDao{
	private Connection connection;
	private PreparedStatement pst1, pst2;
	private PreparedStatement pst;
	public CandidateDaoImpl() throws SQLException{
		// get cn from db utils
		connection=openConnection();
		pst1=connection.prepareStatement("select * from candidates");
		pst=connection.prepareStatement("insert into candidates(name, party, votes) values(?,?,?)");
		pst2=connection.prepareStatement("select * from candidates where name=? and party=?");
		System.out.println("candidate dao created!");
	}

	public boolean checkCandidate(String name, String party) throws SQLException{
		pst2.setString(1, name);
		pst2.setString(2, party);
		try(ResultSet rst = pst2.executeQuery()){
			if(rst.next())
				return true;
			return false;
		}
	}
	
	public void addCandidate(String name, String party) throws SQLException {
		pst.setString(1, name);
		pst.setString(2, party);
		pst.setInt(3, 0);
		pst.executeUpdate();
	}
	@Override
	public List<Candidate> getAllCandidates() throws SQLException {
		// TODO Auto-generated method stub
		List<Candidate> candidates=new ArrayList<>();
		try(ResultSet rst=pst1.executeQuery())
		{
			while(rst.next())
				candidates.add(new Candidate(rst.getInt(1),rst.getString(2),rst.getString(2),rst.getInt(4)));
		}
		return candidates;
	}
	public void cleanUp() throws SQLException {
		// TODO Auto-generated method stub
		if(connection!=null)
			connection.close();
		System.out.println("Candidate cleaned up");
	}
}

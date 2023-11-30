package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Candidate;
import static utils.DBUtils.*;

public class CandidateDaoImpl implements CandidateDao {
	//fields
	private Connection connection;
	private PreparedStatement pstSelect;
	private PreparedStatement pstUpdate;
	//ctor
	public CandidateDaoImpl() throws SQLException {
		connection = openConnection();
		pstSelect = connection.prepareStatement("select * from candidates");
		pstUpdate = connection.prepareStatement("update candidates set votes = votes + 1 where id = ?");
	}
	
	@Override
	public List<Candidate> getAllCandidateDetails() throws SQLException {
		List<Candidate> candidates = new ArrayList<>();
		try(ResultSet rst = pstSelect.executeQuery()){
			//| id | name    | party    | votes |
			while(rst.next())
				candidates.add(new Candidate(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getInt(4)));
		}
		return candidates;
	}
	
	@Override
	public String incrementVotes(int candidateId) throws SQLException {
		pstUpdate.setInt(1, candidateId);
		int rowsAffected = pstUpdate.executeUpdate();
		if(rowsAffected == 1)
			return "Vote incremented....";
		return "Vote increment failed....";
	}
	
	public void cleanUp() throws SQLException {
		if(pstSelect != null)
			pstSelect.close();
		if(pstUpdate != null)
			pstUpdate.close();
		closeConnection();
	}

}

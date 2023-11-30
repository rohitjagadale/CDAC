package dao;

import java.sql.SQLException;
import java.util.List;

import pojo.Candidate;

public interface CandidateDao {
	//add method to get details of all candidates
	public List<Candidate> getAllCandidateDetails() throws SQLException;
	public String incrementVotes(int candidateId) throws SQLException; 
}

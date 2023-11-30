package tester;

import java.util.List;

import dao.CandidateDaoImpl;
import pojo.Candidate;

public class TestAllCandidateDetails {

	public static void main(String[] args) {
		try {
			// create instance of dao impl class
			CandidateDaoImpl dao = new CandidateDaoImpl();
			//call getAllCandidateDetails mtd to get List of candidates
			System.out.println("Candidates details");
			List<Candidate> candidates = dao.getAllCandidateDetails();
			candidates.forEach(System.out::println);
			//call cleanUp() to close all resourses
			dao.cleanUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

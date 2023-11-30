package tester;

import java.util.Scanner;

import dao.CandidateDaoImpl;

public class TestUpdateSpecificCandidateVotes {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			CandidateDaoImpl dao = new CandidateDaoImpl();
			System.out.println("Enter candidate id:");
			System.out.println(dao.incrementVotes(scan.nextInt()));
			dao.cleanUp();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

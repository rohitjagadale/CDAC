package tester;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dao.CandidateDaoImpl;
import dao.UserDaoImpl;
import pojos.Candidate;
import pojos.User;

public class TestLayeredApp1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			CandidateDaoImpl cDao = new CandidateDaoImpl();
			UserDaoImpl uDao = new UserDaoImpl();
			boolean exitFlag = false;
			int userChoice;
			while(!exitFlag) {
				System.out.println("Enter Choice, 1: Display All users\n2: Display Selected candidates\n3: Add new candidates\n0: Exit");
				userChoice = sc.nextInt();
				switch(userChoice) {
				case 1://Display All users
					System.out.println("Enter role of the user, begin date, end date");
						List<User> users = uDao.getSelectedUsers(sc.next(),
								Date.valueOf(sc.next()),Date.valueOf(sc.next()));
						System.out.println("Selected Users ");
						users.forEach(System.out::println);
					break;
				case 2: // Display Selected Candidates;
					System.out.println("List of all candidates is as follows:");
					List<Candidate> candidates= cDao.getAllCandidates();
					candidates.forEach(System.out::println);
					break;
				case 3://Add new candidates:
					System.out.println("Add details for adding new Candidate:");
					System.out.println("Enter candidate name and party name");
					String cName = sc.next();
					String pName = sc.next();
					if(cDao.checkCandidate(cName, pName))
						cDao.addCandidate(cName,pName);
					System.out.println("Candidate Added successfully!!");
					break;
				case 0:
					exitFlag=true;
					System.out.println("Exiting program");
				}
			}
			uDao.cleanUp();
			cDao.cleanUp();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

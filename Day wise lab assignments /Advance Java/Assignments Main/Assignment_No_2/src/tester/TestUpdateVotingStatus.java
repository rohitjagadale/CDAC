package tester;

import java.util.Scanner;

import dao.UserDaoImpl;

public class TestUpdateVotingStatus {

	public static void main(String[] args) {
		try(Scanner scan= new Scanner(System.in)) {
			// create instance of dao impl class
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Enter user id");
			//call updateVotingStatus mtd to set voting status of user
			System.out.println(dao.updateVotingStatus(scan.nextInt()));
			dao.cleanUp();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

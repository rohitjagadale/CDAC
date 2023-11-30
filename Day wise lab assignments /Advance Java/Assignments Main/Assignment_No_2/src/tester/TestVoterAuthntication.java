package tester;

import java.util.Scanner;

import dao.UserDaoImpl;
import pojo.User;

public class TestVoterAuthntication {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Voter Authentication");
			System.out.println("Enter email and password");
			User user = dao.voterAuthentication(scan.next(), scan.next());
			System.out.println(user);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}

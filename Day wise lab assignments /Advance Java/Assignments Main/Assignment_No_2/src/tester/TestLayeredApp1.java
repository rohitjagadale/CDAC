package tester;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import dao.UserDaoImpl;
import pojo.User;

public class TestLayeredApp1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Enter role begin n end date");
			//tester  --> Dao's method
			List<User> users = dao.getSelectedUsers(sc.next(),
					Date.valueOf(sc.next()),Date.valueOf(sc.next()));
			System.out.println("Selected Users ");
			//users.forEach(System.out::println);
			users.forEach(user->System.out.println("User: ,"+user.getFirstName()+","+user.getLastName()+","+user.getDob()+","+user.isVotingStatus()));
			//clean up
			dao.cleanUp();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

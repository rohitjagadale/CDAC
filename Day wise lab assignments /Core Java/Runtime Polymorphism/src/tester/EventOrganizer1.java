package tester;

import java.util.Arrays;
import java.util.Scanner;
import inheritance.*;

public class EventOrganizer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of max participants");
		Person[] members = new Person[sc.nextInt()];// 50
		// System.out.println(Arrays.toString(members));
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println("1. Student Registration\n" + "2.Faculty Registration\n"
					+ "3. Display info of all members \n" + "4. Display info of a specific member\n"
					+ "5. Invoke sub class spcific functionality \n0. Exit");
			System.out.println("Choose ");
			switch (sc.nextInt()) {
			case 1:
				if (counter < members.length) {
					System.out
							.println("Enter student details : fn,  " + "ln,  year" + ",enrolledCourse,  fees,  marks");
					members[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(),
							sc.nextInt());// up casting
					System.out.println("student registered....");
				} else
					System.out.println("Event Full!!!!!");
				break;

			case 2:
				if (counter < members.length) {
					System.out.println("Enter faculty details : fn,  " + "ln,  exp in yrs , sme");
					members[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());// up casting
					System.out.println("faculty registered....");
				} else
					System.out.println("Event Full!!!!!");

				break;
			case 3:// display all
				System.out.println("Info of all participants");
				for (Person p : members)// p=members[0],.....p=members[members.length-1]
					if (p != null)
						System.out.println(p);// p.toString() : run time poly(DMD: dyn method dispatch)
				break;
			case 4:
				System.out.println("Enter seat no");
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter)
					System.out.println(members[index]);// toString : JVM will invoke it on the type of the obj(Faculty |
														// Student)
				else
					System.out.println("Invalid Seat No!!!!!!!!!!!!!");
				break;

			case 5:
				System.out.println("Enter seat no");
				index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					// => seat no valid
					Person person = members[index];
					if (person instanceof Student)
						((Student) person).study();
					else
						((Faculty) person).teach();

				} else
					System.out.println("Invalid Seat No!!!!!!!!!!!!!");

				break;

			case 0:
				exit = true;
				break;
			}
		}
		sc.close();

	}

}

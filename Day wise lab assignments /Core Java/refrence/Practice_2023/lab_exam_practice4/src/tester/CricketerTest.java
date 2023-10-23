package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.core.Cricketer;
import static utils.CricketerUtils.findCrickterByName;

public class CricketerTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			List<Cricketer> cricketerList = new ArrayList<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Option :\n"+"1. Accept minimum 5 Cricketers in the collection.\n"
						+ "2. Modify Cricketer's rating\n"+"3. Search Cricketer by name\n"
						+ "4. Display all Cricketers added in collection.\n"
						+ "5.Display All Cricketers in sorted form by rating."+"6. Exit\n");
				try {
					switch(sc.nextInt()){
					case 1://Accept minimum 5 Cricketers in the collection.
						System.out.println("Enter the name, age, emailId, phone, rating(1-10) of a cricketer");
						Cricketer crick = new Cricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
						cricketerList.add(crick);
						System.out.println("Cricketer is added");
						break;
						
					case 2:// Modify Cricketer's rating
//						System.out.println("Enter the name and new rating of a crickter");
//						Cricketer c1 = findCrickterByName(sc.next(), cricketerList);
//						c1.setRating(sc.nextInt());
//						System.out.println("Cricketer's rating modified");
						
						System.out.println("Enter the rating");
						for(Cricketer c:cricketerList) {
							c.setRating(c.getRating()+sc.nextInt());
						}
						System.out.println("Cricketer's rating modified");
						break;
					case 3://Search Cricketer by name
//						System.out.println("Enter the name of a crickter");
//						Cricketer c1 = findCrickterByName(sc.next(), cricketerList);
//						System.out.println("Cricketer is found : "); 
//						System.out.println(c1);
						
						System.out.println("Enter the name of a crickter");
						String name = sc.next();
						for(Cricketer c:cricketerList) {
							if(c.getName().equals(name))
								System.out.println("Cricketer is found : "); 
								System.out.println(c);
						}
						break;
					case 4://Display all Cricketers added in collection
						System.out.println("All cricketers details");
						for(Cricketer c:cricketerList) {
							System.out.println(c);
						}
						break;
					case 5://All Cricketers in sorted form by rating
						Collections.sort(cricketerList,(c1,c2)-> ((Integer)c1.getRating()).compareTo(c2.getRating()));
						System.out.println("All cricketers details in sorted form by rating");
						for(Cricketer c:cricketerList) {
							System.out.println(c);
						}
						break;
					case 6://Exit
						exit = true;
						System.out.println("Exit!!!!");
						break;
						
						
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}

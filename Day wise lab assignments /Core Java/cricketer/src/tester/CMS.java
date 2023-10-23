package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;

import static util.CrickterValidationRules.*;

import com.app.core.Cricketer;

public class CMS {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			HashMap<String, Cricketer> cricMap = new HashMap<String, Cricketer>();
			cricMap.put("Virat Kohli", new Cricketer("Virat Kohli", 32, "virat@example.com", "1234567890", 90));
			cricMap.put("Rohit Sharma", new Cricketer("Rohit Sharma", 34, "rohit@example.com", "9876543210", 85));
			cricMap.put("MS Dhoni", new Cricketer("MS Dhoni", 40, "ms@example.com", "8765432109", 80));
			cricMap.put("Jasprit Bumrah", new Cricketer("Jasprit Bumrah", 28, "bumrah@example.com", "7654321098", 88));
			cricMap.put("Shikhar Dhawan", new Cricketer("Shikhar Dhawan", 35, "shikhar@example.com", "6543210987", 79));

			while (!exit) {
				try {
					System.out.println("1.Accept minimum 5 Cricketers in the collection.\r\n"

							+ "2.Modify Cricketer's rating\r\n"

							+ "3.Search Cricketer by name\r\n"

							+ "4. Display all Cricketers added in collection.\r\n"

							+ "5.Display All Cricketers in sorted form by rating.\r\n" + "6. Close Appliacation");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter  name, age, email_id, phone, rating");
						Cricketer crickter=validateAll(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),cricMap);
						cricMap.put(crickter.getName(), crickter);
						break;
					case 2:
						System.out.println("Enter the Name of Cricketer");
						String name=sc.next();
						Cricketer modifyCrickter=cricMap.get(name);
						if(modifyCrickter !=null) {
							System.out.println("Enter the New Rating");
							int rating = sc.nextInt();
							modifyCrickter.setRating(rating);
							System.out.println("Rating Update successfully");
						}else {
							System.out.println("Name Not found");
						}
						break;
					case 3:
						System.out.println("Enter the Name of Cricketer");
						name=sc.next();
						Cricketer serchkCrickter=cricMap.get(name);
						if(serchkCrickter!=null) {
							System.out.println("Crickter Found");
							System.out.println(serchkCrickter);
						}else {
							System.out.println("Crickter Not Found");
						}
						break;
					case 4:
						cricMap.forEach((k,v)->System.out.println("Name  : "+k+" Values are: "+v));
						break;
					case 5:
						//Set<Map.Entry<String, Cricketer>> newSet=cricMap.entrySet();
						 List<Map.Entry<String, Cricketer>> list= new ArrayList<>(cricMap.entrySet());
						 Collections.sort(list,new Comparator<Map.Entry<String, Cricketer>>() {
							 public int compare(Map.Entry<String, Cricketer> e1,Map.Entry<String, Cricketer> e2) {
								 return e1.getValue().getRating()-e2.getValue().getRating();
								 //for sorting using name 
								 //return e1.getValue().getName().compareTo(e2.getValue().getName());
								 //for sorting using name decending 
								 //return e2.getValue().getName().compareTo(e1.getValue().getName());
							 }
						});
						 
						 list.forEach((s)->System.out.println(s.getKey()+" "+ s.getValue()));
						
						break;
					case 6:
						exit = true;
						break;

					}

				} catch (Exception e) {
					System.out.println("Unexpected error Occures" + e.getMessage());
					e.printStackTrace();
					sc.nextLine();
				}
			}

		} // scnner close
	}

}

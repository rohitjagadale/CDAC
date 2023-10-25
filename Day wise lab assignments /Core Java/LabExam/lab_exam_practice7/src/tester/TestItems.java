package tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import static utils.ItemUtils.populateItems;
import com.app.items.Item;
import static utils.ItemValidationRules.*;

public class TestItems {

	public static void main(String[] args) throws ParseException {
		try(Scanner sc = new Scanner(System.in)){
			//Map<String,Item> itemMap = new HashMap<>();
			Map<String,Item> itemMap = populateItems();
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Options : \n"+"1. Accept Item details\n"+"2. Display all details\n"
									+"3. Sort these details as per Item code. Store them in binary file\n"
									+"4. Sort these details as per Item price. Store them in binary file\n"	+ "5. Exit\n");
				try {
					switch(sc.nextInt()) {
					case 1://Accept Item details
						System.out.println("Enter the itemCode, itemDescription, itemPrice, shippingDate of an Item :");
						String itemCode = sc.next();
						checkDupItemCode(itemCode, itemMap);
						Item item = new Item(itemCode, sc.next(), sc.nextDouble(), validateShippingDate(sc.next()));
						itemMap.put(itemCode, item);
						System.out.println("Item is added");
						break;
						
					case 2://Display all details
						System.out.println("All item details");
						itemMap.forEach((iCode,item1)->System.out.println(item1));
						break;
						
					case 3://Sort these details as per Item code. Store them in binary file
						Map<String,Item> itemTreeMap = new TreeMap<>(itemMap);
						itemTreeMap.forEach((iCode,item1)->System.out.println(item1));
						System.out.println("Item details sorted as item code");
						System.out.println("Enter file name : ");
						try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(sc.next()))){
							out.writeObject(itemTreeMap);
						}catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Data stored in file");
						break;
						
					case 4://Sort these details as per Item price. Store them in binary file
						List<Item> itemList = new ArrayList<>(itemMap.values());
						Collections.sort(itemList,(i1,i2)->(((Double)i1.getItemPrice()).compareTo(i2.getItemPrice())));
						itemList.forEach(item1->System.out.println(item1));
						System.out.println("Item details sorted as Item price");
						System.out.println("Enter file name : ");
						try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(sc.next()))){
							out.writeObject(itemList);
						}catch(Exception e) {
							e.printStackTrace();
						}
						System.out.println("Data stored in file");
						break;
						
					case 5://Exit
						exit = true;
						System.out.println("Exit!!!!!");
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

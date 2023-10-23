package com.shop.tester;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Admin;
import com.shop.core.Order;
import com.shop.core.Pet;
import com.shop.core.Status;

import static com.shop.utils.Login.*;
import static com.shop.utils.PetExceptionHandling.*;
import static com.shop.utils.BasicFunctionality.*;
import static com.shop.utils.OrderExceptionHandling.*;

public class Tester {

	public static Object loginObject = null;
	
	public static void main(String[] args)
	{
		try(Scanner scanner = new Scanner(System .in))
		{
			
			Map<Integer, Pet> listPet = new HashMap<>();
			List<Order> listOrder = new ArrayList<Order>();
			Map<String, String> users = new HashMap<String, String>();

			boolean exit = false;
			while(!exit)
			{
				System.out.println(   "1. Login\n"
									+ "2. Add new Pet\n"
									+ "3. Update Pet details\n"
									+ "4. Display all available pets\n"
									+ "5. Order a Pet\n"
									+ "6. Check order status by Order Id\n"
									+ "7. Update order status (Admin only functionality)\n"
									+ "0. Exit");
				
				try
				{
					switch (scanner.nextInt())
					{
					
					case 1:
						System.out.print("Enter ID & Password: ");
						validateLogin(scanner.next(), scanner.next());
						if(loginObject instanceof Admin)
							System.out.println("\nLogged in as Admin!\n");
						else
							System.out.println("\nLogged in as Customer\n");
						break;

					case 2:
						checkLoginAdmin();
						System.out.println("\nEnter Pet ID, Name, Category, Price, Stocks: ");
						Pet pet = validatePetAll(listPet,scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt());
						listPet.put(pet.getPetId(),pet);
						System.out.println("Pet Added!\n");
						break;
						
					case 3:
						checkLoginAdmin();
						System.out.print("\nEnter Pet ID to Update: ");
						pet = checkPet(listPet, scanner.nextInt());
						System.out.println("Enter New Pet Name, Category, Price, Stocks: ");
						updatePet(scanner.next(), scanner.next(), scanner.nextDouble(), scanner.nextInt(), pet);
						System.out.println("\nPet Updated");
						break;
						
					case 4:
						listPet.forEach((i,p)->System.out.println(p));
						break;
						
					case 5:
						checkLoginCustomer();
						System.out.print("\nEnter PetID , Quantity: ");
						listOrder.add(validateOrder(scanner.nextInt(), scanner.nextInt(), listOrder, listPet));
						System.out.println("\nOrder Placed!\n");
						break;
						
					case 6:
						System.out.print("\nEnter Order ID : ");
						System.out.println("Order Status: "+checkOrder(scanner.nextInt(), listOrder).getStatus()+"\n");
						break;
						
					case 7:
						checkLoginAdmin();
						System.out.print("\nEnter Order ID and Status: ");
						checkOrder(scanner.nextInt(), listOrder).setStatus(Status.valueOf(scanner.next().toUpperCase()));;
						break;
						
						
					default:
						exit = true;
						break;
					}
					
					
				} catch (Exception e)
				{
					
					System.out.println(e.getMessage()+"\n");
				}
				
				
			}
			
		}
	}

}

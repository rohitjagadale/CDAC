package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import static utils.PenValidatationRules.*;
import com.app.core.Pen;

import custom_exceptions.PenHandlingExceptions;
import static utils.PenUtils.populatePenMap;
public class TestPen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<Integer,Pen> penMap = new HashMap<>();
		Map<Integer,Pen> penMap = populatePenMap();
		boolean flag = false;
		
		try(Scanner sc = new Scanner(System.in)){
			while(!flag) {
				System.out.println("Enter the Options :\n"+"1. Add new Pen\r\n" + "2. Update stock of aPen\r\n"
						+ "3. Set discount of 20% for all the pens which are not at all sold in last 3 months\r\n"
						+ "4. Remove Pens which arenever sold once listed in 9 months\n"+
						"5. Display all pens details\n"+ "6. Exit\n");
				try {
					switch(sc.nextInt()) {
					case 1://Add new Pen
						System.out.println("Enter brand,color,inkColor,material,stock, listing date,price of a pen");
						Pen p1 = validateAll(sc.next(), sc.next(), sc.next(), sc.next(),sc.nextInt(), sc.next(),sc.nextDouble());
						penMap.put(p1.getPenID(), p1);
						System.out.println("Pen is added");
						break;
						
					case 2://Update stock of a Pen
						System.out.println("Enter the penId and count of stock");
						p1 = penMap.get(sc.nextInt());
						if(p1==null)
							throw new PenHandlingExceptions("Invalid Id!!!!");
						else
							p1.setStock(p1.getStock()+sc.nextInt());
						System.out.println("Stock is updated");
						break;
						
					case 3://Set discount of 20% for all the pens which are not at all sold in last 3 months
//						System.out.println("Enter the penId and discount");
//						p1 = penMap.get(sc.nextInt());
//						if(p1==null)
//							throw new PenHandlingExceptions("Invalid Id!!!!"); 
//						LocalDate todaysDate = LocalDate.now();
//						Period period = Period.between(p1.getStockListingDate(), todaysDate);
//						p1.setDiscount(sc.nextDouble());
//						long months = period.toTotalMonths();
//						if(months>3) {
//							p1.setPrice(p1.getPrice()-p1.getDiscount());	
//							System.out.println("Discount is added");	
//						}else
//							System.out.println("Discount is not added");	
						
						LocalDate todaysDate = LocalDate.now();
						Iterator<Pen> penItr = penMap.values().iterator();
						
						while(penItr.hasNext()) {
							Pen pen1 = penItr.next();
							if((Period.between(pen1.getStockListingDate(), todaysDate)).toTotalMonths()>3) {
								pen1.setDiscount(20);
								pen1.setPrice(pen1.getPrice()-pen1.getDiscount());
							}
						}
						System.out.println("Discount is added");	
						break;
						
					case 4://Remove Pens which arenever sold once listed in 9 months
						todaysDate = LocalDate.now();
						penItr = penMap.values().iterator();
						while(penItr.hasNext()) {
							Pen pen1 = penItr.next();
							if((Period.between(pen1.getStockListingDate(), todaysDate)).toTotalMonths()>9) {
								penItr.remove();
							}
						}
						System.out.println("Pens are removed");
						break;
						
					case 5://Display all pens details
						System.out.println("Pen Details");
						for(Pen p:penMap.values())
							System.out.println(p);
						break;
						
					case 6://exit
						flag = true;
						System.out.println("Exit !!!!!");
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
				
			}
		}//sc.close()
		

	}

}

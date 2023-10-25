package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.stocks.Stock;

public class StockTradingService {

	public static void main(String[] args) {
		try(Scanner sc =  new Scanner(System.in)){
			 Map<String,Stock> stockMap = new HashMap<>();
			 boolean exit = false;
			 while(!exit) {
				 System.out.println("Enter Options :\n"+"1. Add New stock in the market\n"+"2. View Available stocks by Company\n"+
						 			"3. Purchase stocks\n"+"4. Sell Stocks\n"+"5. Save n Exit : Before terminating application \n"+"6. Exit\n");
				 try {
					 switch(sc.nextInt()) {
					 case 1:
						 break;
					 case 2:
						 break;
					 case 3:
						 break;
					 case 4:
						 break;
					 case 5:
						 break;
					 case 6://Exit
						 exit = true;
						 System.out.println("Exit!!!!");
						 break;
					 
					 }
				 }catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			 }
		}
	}

}

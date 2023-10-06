import java.util.*;

class Food{

public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	
	// prices
	int Dosa=20;
	int samosa=15;
	int vadapav=15;
	int idali=20;
	int utthapa=20;
	int poha =20;
	int pongal=20;
	int chai=10;
	int coffee=15;
	boolean exit = false;
	int bill=0;
	
	
	
	
	while(!exit){
	
	System.out.println("Chose food Item from given Menu and quantity");
	System.out.println("1 For Dosa Price - 20 Rs");
	System.out.println("2 For Samosa Price - 15 Rs");
	System.out.println("3 For Vadapav Price - 15 Rs");
	System.out.println("4 For Idali Price - 20 Rs");
	System.out.println("5 For Utthapa Price - 20 Rs");
	System.out.println("6 For Poha Price - 20 Rs");
	System.out.println("7 For Pongal Price - 20 Rs");
	System.out.println("8 For chai Price - 10 Rs");
	System.out.println("9 For Coeffe Price - 15 Rs");
	
	System.out.println("10 For Genrate Bill ");
	
	int menu =sc.nextInt();
	
	if(menu==10){
	System.out.println("Total Bill Is: "+bill);
	break;}
	
	int quantity =sc.nextInt();
	
	switch(menu){
	case 1:
		 bill += Dosa*quantity;
		 System.out.println(bill);
	break;
	case 2:
		 bill += samosa*quantity;
	break;
	case 3:
		 bill += vadapav*quantity;
	break;
	case 4:
		 bill += idali*quantity;
	break;
	case 5:
		 bill += utthapa*quantity;
	break;
	case 6:
		 bill += poha*quantity;
	break;
	case 7:
		 bill += pongal*quantity;
	break;
	case 8:
		 bill += chai*quantity;
	break;
	case 9:
		 bill += coffee*quantity;
	break;
	case 10:
		System.out.println("Total Bill Is: "+bill);
		exit = true;
	break;
	

	}
	
	}
	
}
}



/*4.5  Create a driver  class(for UI )  , "TestPoint" , with main(..)
4.6  Accept x,y co-ordinates for 2 points n store the co-ordinates
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)
4.8  (Optional work)
Find out if the points  are same or different (Hint : isEqual)
Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points.*/

import java.util.*;
class TestPoint{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter point1: two cordinates ");
		Point2D p1 = new Point2D(sc.nextDouble() , sc.nextDouble());
		System.out.println(p1.show());
		
		System.out.println("Enter point2: two cordinates ");
		Point2D p2 = new Point2D(sc.nextDouble() , sc.nextDouble());
		System.out.println(p2.show());
		
		//check for point equality
		if(p1.isEqual(p2)){
			System.out.println("Same points");
		}
		else{
			System.out.println("Different points");
			
		}
		
		System.out.println("Disatance between two points is:"+p1.calculateDistance(p2));
		
		sc.close();
		
	}
	
}
package Point1;

import Point2.*;
import java.util.*;

public class TestPoint
{
	public static void main(String[] args)
	{

		//System.out.println("\n1.Enter the coordinates, \n2.Display Coordinates \n3.Exit");
		Scanner sc = new Scanner(System.in);
		int choice, index,n;
		System.out.println("Enter the no of sets enter");
		n= sc.nextInt();
		boolean x = false;
		Point2D[] p = new Point2D[n];
		int[] chkindx = new int[n]; 
		
		while (x == false) 
		{
			System.out.println("\n1.Enter the coordinates \n2.Display Coordinates \n3.Compare the Coordinates\n4.Exit");
			choice = sc.nextInt();
			switch (choice) 
			{
			case 1:
				System.out.println("\nEnter the index to enter the coordinates");
				index = sc.nextInt();
				if(chkindx[index]==1)
				{
					System.out.println("The index is already in use enter another index");
					break;
				}
				if(index<0 || index>=n)
				{
					System.out.println("\nEntered index cannot be found ");
					break;
				}
				System.out.println("\nEnter the coordinates for X and Y");
				p[index] = new Point2D(sc.nextInt(), sc.nextInt());
				chkindx[index]=1;
				break;
			case 2:
				System.out.println("\nEnter the index to print the coordinates");
				index = sc.nextInt();
				System.out.println("\nThe coordinates stored at the index is" + p[index].show());
				break;
			case 3:
				System.out.println("\nEnter the index of the 1st coordinates to compare");
				index = sc.nextInt();
				int index2;
				System.out.println("Enter the index of the 2nd coordinate to compare");
				index2=sc.nextInt();
				boolean y;
				y= p[index].isEqual(p[index2]);
				if(y==true)
				{
					System.out.println("Both the points are same ");
				}
				else
				{
					System.out.println("Both points are not same ");
				}
				break;
			case 4:
				System.out.println("Exit option selected exiting the program");
				x = true;
				break;
				
			default:
				System.out.println("\nNO such option exits re-enter your choice");
				break;

			}
		}


	sc.close();
	}
}

package arrays;

import java.util.Scanner;

import com.cdac.core.Box;

public class TestBoxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of boxes to make");
		Box[] boxes=new Box[sc.nextInt()];
//		int [] test1=new int[10];
//		System.out.println(test1.getClass());
		System.out.println("Name of Box[] class "+boxes.getClass());
		System.out.println(boxes);
		System.out.println("Init def array contents");
	
		for(Box b : boxes)
			System.out.println(b);//null : def value of ref type var=null
		for(int i=0;i<boxes.length;i++)
		{
			System.out.println("Enter Box dims : W d h");
			boxes[i]=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		System.out.println("array contents again ");
		for(Box b : boxes) {
			System.out.println(b);//not null(hashCode)
			//display dims n vol
			System.out.println(b.getBoxDetails());
			System.out.println("Volume "+b.getBoxVolume());		
			if(b.getBoxVolume()>100) {
				double w=b.getBoxWidth();
				w=b.getBoxWidth()*2;
				System.out.println("Box Voulme is gereater than 100 so we have Double its width:"+ w);
			}else {
				System.out.println("Box Voulme is Not gereater than 100 so we have return its orignal width " +b.getBoxWidth());
			}
		}		
		sc.close();

	}

}

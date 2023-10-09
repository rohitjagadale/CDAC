package arrays;

import java.util.Scanner;

public class TestPrimArray {

	public static void main(String[] args) {
		// create a scanner to wrap stdin 
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of the array");
		double[] data=new double[sc.nextInt()];
		System.out.println(data);//NameOfClass@hashCode : address
		System.out.println("class loaded for double[] "+data.getClass());
		//attach for-each to display def contents of the array
		System.out.println("Default contents : ");
		for(double d : data)//d=data[0],d=data[1]....d=data[data.length-1]
			System.out.println(d);
		//accept array contents from user : for loop
		for(int i=0;i<data.length;i++)
		{
			System.out.println("Enter a value");
			data[i]=sc.nextDouble();
		}	
		for(double d : data) //d=data[0],d=data[1]....d=data[data.length-1]
		{
			d *= 2;//doubling the copy of the array elem.	
		}
		for(int i=0;i<data.length;i++)
		{
		
			data[i]*=2;
		}	
		System.out.println("Inited array : ");
		for(double d : data) //d=data[0],d=data[1]....d=data[data.length-1]
		{
			System.out.println(d);
		}
		sc.close();

	}

}

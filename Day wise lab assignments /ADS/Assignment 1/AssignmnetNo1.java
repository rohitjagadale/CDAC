import java.util.Arrays;
import java.util.Scanner;

public class AssignmnetNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size of array");
		int size=sc.nextInt();		
		int [] array=new int [size];
		
		System.out.println("Enter "+size+" Elemnt in array");
		for(int i=0;i<size;i++) {
		System.out.println("Enter New Element");
		array[i]=sc.nextInt();
		}
		
		boolean exit=false;
		while(!exit) {
			System.out.println("1. Display the array\r\n"
					+ "2. Reverse the array\r\n"
					+ "3. Replace the nth element from the array and print\r\n"
					+ "4. Find the addition of all elements of the array\r\n"
					+ "5. Find the maximum number from the array\r\n"
					+ "6. Print the average of all the elements from the array.\r\n"
					+ "7. Display the even and odd number from the array separately.");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Array Of all element");
				System.out.println(Arrays.toString(array));
				break;
			case 2:
				System.out.println("Reverse of array");
				for(int i=size-1;i>=0;i--) {
				System.out.print(array[i]+" ");
				}
				break;
			case 3:
				System.out.println("Enter the elemnt");
				int element=sc.nextInt();
				System.out.println("Enter position on which we have repalce the element");
				int position=sc.nextInt();
				if(position<0 || position<size-1) {
					System.out.println("Envalid position please enter new postion bewtween"+size+" and 0");
					
				}else {
					array[position]=element;
				}
				System.out.println(Arrays.toString(array));
				break;
			case 4:
				//find addition of all array element 
				int sum=0;
				for(int i=0;i<size;i++) {
					sum=sum+array[i];
				}
				System.out.println("Sum of all element is :"+sum);
				break;
			case 5:
				//find max
				int max=array[0];
				for(int i=1;i<size;i++) {
					if(array[i]>max) {
						max=array[i];
					}
				}
				System.out.println("Max Element from array is :"+max);
				break;
			case 6:
				//find average
				int average=0;
				int sum1=0;
				for(int i=0;i<size;i++) {
					 sum1=sum1+array[i];
				}
				average=sum1/size;
				System.out.println("Average of all element from array is: "+average);
				break;
			case 7:
				//Even and odd number from array
				System.out.println("Even number from array is:");
				for(int i=0;i<size;i++) {
					if(array[i]%2==0) {
						System.out.print(array[i]+" ");
					}
				}
				System.out.println("Odd number from array is:");
				for(int i=0;i<size;i++) {
					if(array[i]%2!=0) {
						System.out.print(array[i]+" ");
					}
				}
				
				break;
			}
		}
		
		sc.close();


	}

}

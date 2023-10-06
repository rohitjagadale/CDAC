import java.util.*;  
public class Check{    
    public static void main(String args[]){    
          
        Scanner scan = new Scanner(System.in);  
        double d1;
	
       	
	
	int i=0;
	double sum=0;
	 while(i<2){  
            //Print Double value  
	System.out.println("Enter the number "+(i+1)+" =");
		
            if(scan.hasNextDouble()){ 
 		d1=scan.nextDouble();
                sum=sum+d1; 
            }  
            else{  
                System.out.println("Number is not double");
		  
            }  
i++;
        }  
	System.out.println("Average is  ="+ (sum/2.0));
        scan.close();  
    }    
}
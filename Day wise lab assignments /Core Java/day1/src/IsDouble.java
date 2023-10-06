import java.util.*;  
public class IsDouble {    
    public static void main(String args[]){    
        //Initialize the scanner  
        Scanner scan = new Scanner(" 22.10 Double number is 2123324.58");  
        //Iterate through the tokens  
        while(scan.hasNext()){  
            //Print Double value  
            if(scan.hasNextDouble()){  
                System.out.println("Found Double Value: "+scan.next());  
            }  
            else{  
                System.out.println("Not Found Double Value: "+scan.next());  
            }  
        }  
        scan.close();  
    }    
}
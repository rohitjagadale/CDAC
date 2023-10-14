import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)){

			boolean flag =false; boolean choice=false; Stack stacks=null;
			
			while(!flag)
			{
				System.out.println("Enter the Choise \n 1 -- Choose Fixed Stack\n" + "2 -- Choose Growable Stack \n"+ "3 -- Push data  \n"+ "4 --- Pop data & display the same \n 5 -- Exit \n");
				switch(sc.nextInt()) {
				
				case 1:if(stacks==null)
				{	
					stacks=new FixedStack();
					System.out.println("Your fixed stack created !");
				}
				else System.out.println("You can't change your stack !");
					break;
				case 2: if(stacks==null)
				{	
					stacks=new GrowableStack();
					System.out.println("Your fixed stack created !");
				}
				else System.out.println("You can't change your stack !");
					break;
				case 3:if(stacks!=null)
				{	
					System.out.println("Enter your details :- id , name , address :- ");
					stacks.push(sc.nextInt(),sc.next(),sc.next());
				}
				else System.out.println("1st chooes your stack !");
					break;
				case 4:if(stacks!=null)
				{	
					//System.out.println("Enter your details :- id , name , address :- ");
					stacks.pop();
				}
				else System.out.println("1st chooes your stack !");
					break;
				case 5:System.out.println("Bye !");
					flag=true;
					break;
				default : System.out.println("Enter correct choice !");
			}
		
			}
			
		}

	}

}

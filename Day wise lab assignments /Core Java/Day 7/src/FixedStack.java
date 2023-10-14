
public class FixedStack implements Stack {
		
	private Customer[] stacks=new Customer[SIZE];
	private int count=-1;

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(count==-1)	
			{System.out.println("Stack underflow !"); return;}
		System.out.println(stacks[count-1]);
		stacks[--count]=null;
		if(count==0) count=-1;
	}

	@Override
	public void push(int id, String name, String address) {
		// TODO Auto-generated method stub
		
		if(count==-1) count=0;
		
		if(count<SIZE)
		{
			stacks[count]=new Customer(id,name,address);
			count++;
			System.out.println("Succsefully push !");
		}
		else 
			System.out.println("Stack Overflow !");
	}
	
	
	
}

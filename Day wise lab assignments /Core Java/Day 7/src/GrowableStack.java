
public class GrowableStack implements Stack {
	
	private static Customer[] stacks;
	private int count=-1;
	static {
		stacks=null;
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
			if(count==-1) {System.out.println("Stack Underflow !"); return;}
			
			System.out.println(stacks[--count]);
			if(count==0) count=-1;
	}

	@Override
	public void push(int id, String name, String address) {
		// TODO Auto-generated method stub
		if(count==-1) count=0;
		Customer[] temp=new Customer[count+1];
		for(int i=0;i<count;i++)
			temp[i]=stacks[i];
		temp[count++]=new Customer(id,name,address);
		stacks=temp;
		
	}

}

import java.util.Scanner;

// Stack implementation in Java

class Stack {

	// store elements of stack
	private int arr[];
	// represent top of stack
	private int top;
	// total capacity of the stack
	private int capacity;

	// Creating a stack
	Stack(int size) {
		// initialize the array
		// initialize the stack variables
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// push elements to the top of stack
	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack OverFlow");

			// terminates the program
			System.exit(1);
		}

		// insert element on top of stack
		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	// pop elements from top of stack
	public int pop() {

		// if stack is empty
		// no element to pop
		if (isEmpty()) {
			System.out.println("STACK EMPTY");
			// terminates the program
			System.exit(1);
		}

		// pop element from top of stack
		return arr[top--];
	}

	// return size of the stack
	public int getSize() {
		return top + 1;
	}

	// check if the stack is empty
	public Boolean isEmpty() {
		return top == -1;
	}

	// check if the stack is full
	public Boolean isFull() {
		return top == capacity - 1;
	}

	// display elements of stack
	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter queue size");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		boolean exit = false;

		while (!exit) {
			System.out.println("1. Show the queue\r\n" + "2. Store the data in the queue\r\n"
					+ "3. remove the data from the queue\r\n" + "4. Check how many elements are there in the queue.\r\n"
					+ "5. Check to see if the queue is full?\r\n" + "6. Check to see if queue is empty.");

			switch (sc.nextInt()) {
			case 1:
				System.out.print("Stack: ");
				stack.printStack();
				break;

			case 2:
				System.out.println("Enter new element");
				stack.push(sc.nextInt());
				break;
			case 3:
				stack.pop();
				System.out.println("Removing element successfully");
				break;
			case 4:
				System.out.println(stack.getSize());
				break;
			case 5:
				System.out.println(stack.isFull());
				break;
			case 6:
				System.out.println(stack.isEmpty());
				break;
			case 7:
				exit = true;
				break;

			}
		}
		sc.close();
	}
}

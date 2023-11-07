


import java.util.Scanner;

class SinglyCircularList {
	// Node class
	static class Node {
		// Node class fields
		private int data;
		private Node next;
		// Node class methods
		public Node() {
			data = 0;
			next = null;
		}
		public Node(int val) {
			data = val;
			next = null;
		}
	}
	
	// List class fields
	private Node head;
	// List class methods
	public SinglyCircularList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void display() {
		System.out.println("List: ");
		// special1: list is empty, then return
		if(isEmpty())
			return;
		// general: print all nodes in list
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while(trav != head);
	}

	public void addLast(int val) {
		// create new node and init it.
		Node newNode = new Node(val);
		// special 1: if list is empty, newNode is the first node & make it circular.
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
		}
		// general: add node at the end
		else {
			// traverse till last node (trav) i.e. the node whose next contains head.
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			// newnode's next to head
			newNode.next = head;
			// last node's (trav) next to newnode
			trav.next = newNode;
		}
	}

	public void addFirst(int val) {
		// create new node and init it.
		Node newNode = new Node(val);
		// special 1: if list is empty, newNode is the first node & make it circular.
		if(isEmpty()) {
			head = newNode;
			newNode.next = head;
		}
		// general: add node at the end
		else {
			// traverse till last node (trav) i.e. the node whose next contains head.
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			// newnode's next to head
			newNode.next = head;
			// last node's (trav) next to newnode
			trav.next = newNode;
			// make head to newNode
			head = newNode;
		}
	}

	public void addAtPos(int val, int pos) {
		// special 1: if list is empty, add node at the start
		// special 2: if pos<=1, add node at the start
		if(head == null || pos <= 1)
			addFirst(val);
		// general: add node at given pos
		else {
			// allocate & init new node
			Node newNode = new Node(val);
			// traverse till pos-1 (trav)
			Node trav = head;
			for(int i=1; i < pos-1; i++) {
				// special 3: if pos > length of list, add node at the end.
				if(trav.next == head)
					break;
				trav = trav.next;
			}
			// newnode's next should point to trav's next
			newNode.next = trav.next;
			// trav's next should pointer to new node
			trav.next = newNode;
		}
	}
	
	public void delFirst() {
		// special 1: if list is empty, throw exception
		if(isEmpty())
			throw new RuntimeException("List is empty.");
		// special 2: if list has single node, then make head null
		if(head.next == head)
			head = null;
		// general: delete first node
		else {
			// traverse till last node (trav)
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			// take head to the next (2nd) node
			head = head.next;
			// the last node (trav) next should be to new head
			trav.next = head;
		}
	}
	
	public void delAtPos(int pos) {
		// special 1: if pos = 1, delete first node
		if(pos == 1)
			delFirst();
		// special 2: if list is empty or pos < 1, then throw exception.
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid position.");
		// take temp pointer running behind trav.
		Node temp = null, trav = head;
		// traverse till pos (trav)
		for(int i = 1; i < pos; i++) {
			// special 3: if pos is beyond list length, then throw exception.
			if(trav.next == head)
				throw new RuntimeException("Invalid position.");
			temp = trav;
			trav = trav.next;
		}
		// trav is node to be deleted & temp is node before that
		temp.next = trav.next;
		// trav node will be garbage collected
	}

	public void delLast() {
		// Lab Assignment
	}
	
	public void delAll() {
		head.next = null;
		head = null;
	}
}

public class SinglyCircularListMain {
	public static void main(String[] args) {
		int choice, val, pos;
		SinglyCircularList list = new SinglyCircularList();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display
				list.display();
				break;
			case 2: // Add First
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				list.addFirst(val);
				break;
			case 3: // Add Last
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				list.addLast(val);
				break;
			case 4: // Add At Pos
				System.out.print("Enter new element: ");
				val = sc.nextInt();
				System.out.print("Enter element position: ");
				pos = sc.nextInt();
				list.addAtPos(val, pos);				
				break;
			case 5: // Del First
				try {
					list.delFirst();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6: // Del Last
//				try {
//					list.delLast();
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//				}
				break;
			case 7: // Del At Pos
				System.out.print("Enter element position: ");
				pos = sc.nextInt();
				try {
					list.delAtPos(pos);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8: // Del All
				list.delAll();
				break;
			}
		} while(choice!=0);
		sc.close();
	}

}

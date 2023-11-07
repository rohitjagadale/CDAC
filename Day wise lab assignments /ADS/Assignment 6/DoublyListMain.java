


import java.util.Scanner;
class DoublyList {
	// Node class
	static class Node {
		// Node class fields
		private int data;
		private Node next;
		private Node prev;
		// Node class methods
		public Node() {
			data = 0;
			next = null;
			prev = null;
		}
		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}
	}
	
	// List class fields
	private Node head;
	
	// List class methods
	public DoublyList() {
		head = null;
	}
	
	public void displayForward() {
		System.out.println("Fwd List: ");
		Node trav = head;
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.next;
		}
	}

	public void displayReverse() {
		System.out.println("Rev List: ");
		// special 1: if empty list, return.
		if(head == null)
			return;
		// traverse till last node
		Node trav = head;
		while(trav.next != null)
			trav = trav.next;
		// print all nodes in rev direction
		while(trav != null) {
			System.out.println(trav.data);
			trav = trav.prev;
		}	
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addLast(int val) {
		// create new node & init it
		Node newNode = new Node(val);
		// special 1: if list is empty, make new node as first node of list
		if(head == null) {
			head = newNode;
		}
		// general: add node at the end
		else {
			// traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			// add new node after trav (trav.next)
			trav.next = newNode;
			// newnode's prev to last node (trav)
			newNode.prev = trav;
		}
	}

	void addFirst(int val) {
		// create new node and init it
		Node newNode = new Node(val);
		// special 1: if list is empty
		if(isEmpty()) {
			head = newNode;
		}
		// general: add node at the start
		else {
			// new node next should point to head
			newNode.next = head;
			// head's prev to newNode
			head.prev = newNode;
			// head should point to new node
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
			Node temp, trav = head;
			for(int i=1; i < pos-1; i++) {
				// special 3: if pos > length of list, add node at the end.
				if(trav.next == null)
					break;
				trav = trav.next;
			}
			// take temp pointer to node after trav
			temp = trav.next;
			// newnode's next should point to trav's next i.e. temp
			newNode.next = temp;
			// newnode's prev to trav
			newNode.prev = trav;
			// trav's next should pointer to new node
			trav.next = newNode;
			// temp's prev to newNode
			if(temp != null) // special 3: if adding at end, next line is not required.
				temp.prev = newNode;
		}
	}
	
	public void delFirst() {
		// special 1: if list is empty, throw exception
		if(head == null)
			throw new RuntimeException("List is empty.");
		// special 2: if list has single node, make head null
		if(head.next == null)
			head = null;
		// general: 
		else {
			// make head pointing to next node.
			head = head.next;
			// note: the old first node will be garbage collected.
			// second node (new head) prev should be null
			head.prev = null;
		}
	}

	public void delAtPos(int pos) {
		// special 1: if pos = 1, delete first node
		if(pos == 1)
			delFirst();
		// special 2: if list is empty or pos < 1, then throw exception.
		if(head == null || pos < 1)
			throw new RuntimeException("List is empty or Invalid position.");
		Node trav = head;
		// traverse till pos (trav)
		for(int i = 1; i < pos; i++) {
			// special 3: if pos is beyond list length, then throw exception.
			if(trav == null)
				throw new RuntimeException("Invalid position.");
			trav = trav.next;
		}
		// trav's previous node's next to trav's next node
		trav.prev.next = trav.next;
		// trav's next node's prev to trav's previous node
		if(trav.next != null) // special 3: while deleting last node, skip next line.
			trav.next.prev = trav.prev;
		// trav node will be garbage collected
	}

	// Lab Assignment: delLast()
}

public class DoublyListMain {
	public static void main(String[] args) {
		int choice, val, pos;
		DoublyList list = new DoublyList();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n0. Exit\n1. Display\n2. Add First\n3.  Add Last\n4. Add At Pos\n5. Del First\n6.  Del Last\n7. Del At Pos\n8. Del All\nEnter choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: // Display
				list.displayForward();
				list.displayReverse();
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
//				list.delAll();
				break;
			}
		} while(choice!=0);
		sc.close();
	}
}

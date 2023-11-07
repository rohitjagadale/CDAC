package com.app.core.circular;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the circular queue: ");
		int size = sc.nextInt();

		CircularQueue queue = new CircularQueue(size);

		boolean exit = false;
		while (!exit) {
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Show queue");
			System.out.println("4. Size of queue");
			System.out.println("5. Is queue empty?");
			System.out.println("6. Is queue full?");
			System.out.println("7. Exit");
			System.out.println("Enter your choice: ");

			

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the data to enqueue: ");
				int data = sc.nextInt();
				queue.enqueue(data);
				break;
			case 2:
				int dequeuedData = queue.dequeue();
				if (dequeuedData != -1) {
					System.out.println("The dequeued data is: " + dequeuedData);
				}
				break;
			case 3:
				queue.show();
				break;
			case 4:
				int size1 = queue.size();
				System.out.println("The size of the queue is: " + size1);
				break;
			case 5:
				boolean isEmpty = queue.isEmpty();
				System.out.println("Is queue empty?: " + isEmpty);
				break;
			case 6:
				boolean isFull = queue.isFull();
				System.out.println("Is queue full?: " + isFull);
				break;
				
			default:
				System.out.println("Invalid choice");
			}
		}
		sc.close();
	}
}

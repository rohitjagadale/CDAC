package com.app.core.queue;

import java.util.Scanner;

public class Queue {

	private int[] queue;
	private int front, rear, capacity;

	public Queue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		front = rear = 0;
	}

	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}

		queue[rear] = element;
		rear++;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}

		int element = queue[front];
		front++;
		return element;
	}

	public boolean isFull() {
		return rear == capacity;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public int size() {
		return rear - front;
	}

	public void display() {
		System.out.println("Queue: ");
		for (int i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
}

class QueueOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the count of elements: ");
		int capacity = sc.nextInt();

		Queue queue = new Queue(capacity);

		boolean exit = false;
		while (!exit) {
			System.out.println("Queue Operations: ");
			System.out.println("1. Show queue");
			System.out.println("2. Store data in queue");
			System.out.println("3. Access data from queue");
			System.out.println("4. Check the size of queue");
			System.out.println("5. Check if queue is full");
			System.out.println("6. Check if queue is empty");
			System.out.println("7. Exit");

			System.out.println("Enter your choice: ");

			switch (sc.nextInt()) {
			case 1:
				queue.display();
				break;

			case 2:
				System.out.println("Enter the data to store: ");
				int element = sc.nextInt();
				queue.enqueue(element);
				break;

			case 3:
				int data = queue.dequeue();
				if (data != -1) {
					System.out.println("Data dequeued: " + data);
				}
				break;

			case 4:
				System.out.println("Size of the queue: " + queue.size());
				break;

			case 5:
				System.out.println("Is queue full? " + queue.isFull());
				break;

			case 6:
				System.out.println("Is queue empty? " + queue.isEmpty());
				break;

			case 7:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
			}
		}

		sc.close();
	}
}
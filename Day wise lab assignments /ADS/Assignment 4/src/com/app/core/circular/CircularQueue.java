package com.app.core.circular;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        queue = new int[size];
        front = 0;
        rear = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        queue[rear++] = data;
        rear %= queue.length;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = queue[front++];
        front %= queue.length;
        return data;
    }

    public void show() {
        for (int i = front; i != rear; i = (i + 1) % queue.length) {
            System.out.println(queue[i]);
        }
    }

    public int size() {
        return (rear - front) % queue.length;
    }
}


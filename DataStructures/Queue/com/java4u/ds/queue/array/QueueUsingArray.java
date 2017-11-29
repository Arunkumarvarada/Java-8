package com.java4u.ds.queue.array;

public class QueueUsingArray {

	private int capacity;
	private int queue[];
	private int front = 0;
	private int rear = -1;
	private int currentSize = 0;

	public QueueUsingArray(int size) {
		this.capacity = size;
		queue = new int[capacity];
	}

	public void enQueue(int data) {
		if (isQueueFull()) {
			System.out.println("Unable to add an Element overflow occured " + data);
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queue[rear] = data;
			currentSize++;
			System.out.println("Element " + data + " is pushed to Queue !!");
		}
	}

	private void deQueue() {
		if (isQueueEmpty()) {
			System.out.println("Underflow! unable to remove the element from Queue");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println("pop operation done! removed: " + queue[front - 1]);
				front = 0;
			} else {
				System.out.println("Pop operation done! removed: " + queue[front - 1]);
			}
			currentSize--;
		}
	}

	public boolean isQueueEmpty() {
		return (currentSize == 0) ? true : false;
	}

	public boolean isQueueFull() {
		return (currentSize == capacity) ? true : false;
	}

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(12);
		queue.enQueue(4);
		queue.deQueue();
		queue.enQueue(56);
		queue.enQueue(2);
		queue.enQueue(67);
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(24);
		queue.deQueue();
		queue.enQueue(98);
		queue.enQueue(45);
		queue.enQueue(23);
		queue.enQueue(435);

	}

}

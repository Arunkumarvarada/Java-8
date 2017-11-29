package com.java4u.ds.queueusinglist;

public class MyQueue {
	private QueueNode front = null;
	private QueueNode rear = null;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return (front == null) ? true : false;
	}

	public void enQueue(int data) {

	}

	public int deQueue() {
		int value = 0;
		QueueNode temp= front;
		if (isEmpty()) {
			System.out.println("Queue is Empty!!");
		} else {
			front = front.getNext();
			value= temp.getData();
			temp=null;
		}
		size--;
		return value;
	}
}

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

		if (size == 0) {
			front = rear = null;
		}
		QueueNode newNode = new QueueNode(data);
		if (front == rear) {
			if (null == front) {
				front = rear = newNode;
			} else {
				rear.setNext(newNode);
				rear = newNode;
			}
		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
		size++;
	}

	public int deQueue() {
		int value = 0;
		QueueNode temp = front;
		if (isEmpty()) {
			System.out.println("Queue is Empty!!");
		} else {
			front = front.getNext();
			value = temp.getData();
			temp = null;
		}
		size--;
		return value;
	}

	public void traverse() {
		if (front == null) {
			System.out.println(" Queue is Empty!! ");
		} else {
			QueueNode temp = front;
			while (temp != rear) {
				System.out.print(temp.getData() + " ");
				temp = temp.getNext();
			}
			System.out.print(temp.getData() + " ");
			System.out.println();
		}
	}
}

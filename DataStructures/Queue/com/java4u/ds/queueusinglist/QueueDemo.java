package com.java4u.ds.queueusinglist;

public class QueueDemo {

	public static void main(String[] args) {

		MyQueue myQueue = new MyQueue();
		System.out.println(myQueue.isEmpty());
		myQueue.enQueue(23);
		myQueue.enQueue(34);
		myQueue.enQueue(45);
		myQueue.enQueue(56);
		myQueue.enQueue(90);
		myQueue.traverse();
		System.out.println(myQueue.getSize());
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.traverse();
		System.out.println(myQueue.isEmpty());

	}
}

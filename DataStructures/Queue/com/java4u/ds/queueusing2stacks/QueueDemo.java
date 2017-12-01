package com.java4u.ds.queueusing2stacks;

public class QueueDemo {

	public static void main(String[] args) {

		QueueUsingTwoStacks myQueue = new QueueUsingTwoStacks();
		System.out.println(myQueue.isEmpty());
		myQueue.enQueue(23);
		myQueue.enQueue(34);
		myQueue.enQueue(45);
		myQueue.enQueue(56);
		myQueue.enQueue(90);
		
		System.out.println(myQueue.getSize());
		myQueue.deQueue();
		myQueue.deQueue();
		myQueue.deQueue();
		System.out.println(myQueue.getSize());
		System.out.println(myQueue.isEmpty());

	}
}

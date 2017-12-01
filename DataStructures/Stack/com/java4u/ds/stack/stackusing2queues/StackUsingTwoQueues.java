package com.java4u.ds.stack.stackusing2queues;

import com.java4u.ds.queueusinglist.MyQueue;

public class StackUsingTwoQueues {

	private MyQueue queueOne = new MyQueue();
	private MyQueue queueTwo = new MyQueue();

	public boolean isEmpty() {
		return (queueOne.isEmpty() && queueTwo.isEmpty());
	}

	public int getSize() {
		if (queueOne.isEmpty()) {
			return queueTwo.getSize();
		} else {
			return queueOne.getSize();
		}
	}

	public void traverse() {
		if (queueOne.isEmpty()) {
			queueTwo.traverse();
		} else {
			queueOne.traverse();
		}
	}

	public int pop() {
		int i = 0, size;
		if (queueTwo.isEmpty()) {
			size = queueOne.getSize();
			while (i < (size - 1)) {
				queueOne.enQueue(queueTwo.deQueue());
				i++;
			}
			return queueOne.deQueue();
		} else {
			size = queueTwo.getSize();
			while (i < (size - 1)) {
				queueTwo.enQueue(queueOne.deQueue());
				i++;
			}
			return queueTwo.deQueue();
		}
	}

	public void push(int data) {
		if (queueOne.isEmpty()) {
			queueTwo.enQueue(data);
		} else {
			queueOne.enQueue(data);
		}
	}
}

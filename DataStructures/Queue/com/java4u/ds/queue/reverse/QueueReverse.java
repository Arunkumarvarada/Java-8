package com.java4u.ds.queue.reverse;

import com.java4u.ds.queueusinglist.MyQueue;

public class QueueReverse {

	private MyQueue queue = null;

	public QueueReverse(MyQueue queue) {
		this.queue = queue;
	}

	public void reverse() {
		if (queue.isEmpty()) {
			return;
		} else {
			int temp = queue.deQueue();
			reverse();
			queue.enQueue(temp);
		}
	}
}

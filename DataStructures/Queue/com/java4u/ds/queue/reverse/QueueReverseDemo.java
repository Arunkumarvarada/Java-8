package com.java4u.ds.queue.reverse;

import com.java4u.ds.queueusinglist.MyQueue;

public class QueueReverseDemo {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue(23);
		queue.enQueue(33);
		queue.enQueue(24);
		queue.enQueue(55);
		queue.enQueue(67);
		queue.enQueue(11);
		queue.enQueue(34);
		queue.enQueue(56);
		queue.traverse();
		QueueReverse queueReverse = new QueueReverse(queue);
		queueReverse.reverse();
		queue.traverse();

	}

}

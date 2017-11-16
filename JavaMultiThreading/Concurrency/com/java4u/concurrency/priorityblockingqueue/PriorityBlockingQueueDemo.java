package com.java4u.concurrency.priorityblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

import com.java4u.concurrency.common.PriorityBlockingQueueConsumer;
import com.java4u.concurrency.common.PriorityBlockingQueueProducer;

public class PriorityBlockingQueueDemo {
	public static void main(String[] args) {
		
		final BlockingQueue<String> priorityBlockingQueue = new PriorityBlockingQueue<String>();
		PriorityBlockingQueueProducer queueProducer = new PriorityBlockingQueueProducer(priorityBlockingQueue);
		new Thread(queueProducer).start();

		PriorityBlockingQueueConsumer queueConsumer1 = new PriorityBlockingQueueConsumer(priorityBlockingQueue);
		new Thread(queueConsumer1).start();

		PriorityBlockingQueueConsumer queueConsumer2 = new PriorityBlockingQueueConsumer(priorityBlockingQueue);
		new Thread(queueConsumer2).start();

	}
}

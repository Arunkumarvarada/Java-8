package com.java4u.concurrency.delayblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

import com.java4u.concurrency.common.DelyedQueueConsumer;
import com.java4u.concurrency.common.DelyedQueueProducer;

public class DelayedQueueDemo {

	public static void main(String[] args) {
		final BlockingQueue<DelayElement> queue = new DelayQueue<DelayElement>();

		DelyedQueueProducer queueProducer = new DelyedQueueProducer(queue);
		new Thread(queueProducer).start();

		DelyedQueueConsumer queueConsumer1 = new DelyedQueueConsumer(queue);
		new Thread(queueConsumer1).start();

		DelyedQueueConsumer queueConsumer2 = new DelyedQueueConsumer(queue);
		new Thread(queueConsumer2).start();


	}

}

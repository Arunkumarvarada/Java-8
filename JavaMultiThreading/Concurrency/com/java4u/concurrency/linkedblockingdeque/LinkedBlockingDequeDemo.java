package com.java4u.concurrency.linkedblockingdeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

import com.java4u.concurrency.common.LinkedBlockingDequeConsumer;
import com.java4u.concurrency.common.LinkedBlockingDequeProducer;

public class LinkedBlockingDequeDemo {

	public static void main(String[] args) {
		BlockingDeque<String> deque = new LinkedBlockingDeque<String>();

		LinkedBlockingDequeProducer linkedBlockingDequeProducer = new LinkedBlockingDequeProducer(deque);
		new Thread(linkedBlockingDequeProducer).start();
		
		LinkedBlockingDequeConsumer linkedBlockingDequeConsumer1 = new LinkedBlockingDequeConsumer(deque);
		new Thread(linkedBlockingDequeConsumer1).start();
		
		LinkedBlockingDequeConsumer linkedBlockingDequeConsumer2 = new LinkedBlockingDequeConsumer(deque);
		new Thread(linkedBlockingDequeConsumer2).start();

	}

}

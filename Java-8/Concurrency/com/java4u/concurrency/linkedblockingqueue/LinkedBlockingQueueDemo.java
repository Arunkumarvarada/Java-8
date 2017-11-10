package com.java4u.concurrency.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> unbounded = new LinkedBlockingQueue<String>();

		Producer producer = new Producer(unbounded);
		Consumer consumer = new Consumer(unbounded);

		new Thread(producer).start();
		new Thread(consumer).start();
		Thread.sleep(4000);

	}

}

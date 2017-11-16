package com.java4u.concurrency.common;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

import com.java4u.concurrency.util.ThreadUtil;

public class SynchronousQueueProducer implements Runnable {

	protected BlockingQueue<String> blockingQueue;
	final Random random = new Random();

	public SynchronousQueueProducer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = UUID.randomUUID().toString();
				System.out.println("Put :" + data);
				blockingQueue.put(data);
				ThreadUtil.sleepThread(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

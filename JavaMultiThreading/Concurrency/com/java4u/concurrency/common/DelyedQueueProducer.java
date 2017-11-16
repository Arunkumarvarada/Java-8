package com.java4u.concurrency.common;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;

import com.java4u.concurrency.delayblockingqueue.DelayElement;
import com.java4u.multithreading.util.ThreadUtil;

public class DelyedQueueProducer implements Runnable {
	protected BlockingQueue<DelayElement> blockingQueue;
	final Random random = new Random();

	public DelyedQueueProducer(BlockingQueue<DelayElement> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				int delay = random.nextInt(10000);
				DelayElement delayElement = new DelayElement(UUID.randomUUID().toString(), delay);
				System.out.println("Put :" + delayElement);
				blockingQueue.put(delayElement);
				ThreadUtil.sleepThread(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

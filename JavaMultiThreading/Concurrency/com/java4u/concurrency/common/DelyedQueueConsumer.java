package com.java4u.concurrency.common;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

import com.java4u.concurrency.delayblockingqueue.DelayElement;
import com.java4u.multithreading.util.ThreadUtil;

public class DelyedQueueConsumer implements Runnable {
	protected BlockingQueue<DelayElement> blockingQueue;
	final Random random = new Random();

	public DelyedQueueConsumer(BlockingQueue<DelayElement> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				DelayElement delayElement = blockingQueue.take();
				System.out.println(Thread.currentThread().getName()+" take() :" + delayElement);
				ThreadUtil.sleepThread(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

package com.java4u.concurrency.common;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

import com.java4u.concurrency.util.ThreadUtil;

public class SynchronousQueueConsumer implements Runnable {
	protected BlockingQueue<String> blockingQueue;
	final Random random = new Random();

	public SynchronousQueueConsumer(BlockingQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = blockingQueue.take();
				System.out.println(Thread.currentThread().getName() + "take() :" + data);
				ThreadUtil.sleepThread(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

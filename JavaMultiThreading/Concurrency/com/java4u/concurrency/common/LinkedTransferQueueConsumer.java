package com.java4u.concurrency.common;

import java.util.Random;
import java.util.concurrent.TransferQueue;

import com.java4u.concurrency.util.ThreadUtil;

public class LinkedTransferQueueConsumer implements Runnable {
	protected TransferQueue<String> blockingQueue;
	final Random random = new Random();

	public LinkedTransferQueueConsumer(TransferQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = blockingQueue.take();
				System.out.println(Thread.currentThread().getName() + "take() :" + data);
				ThreadUtil.sleepThread(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

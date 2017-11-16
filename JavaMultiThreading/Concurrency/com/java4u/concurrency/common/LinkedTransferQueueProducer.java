package com.java4u.concurrency.common;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TransferQueue;

import com.java4u.concurrency.util.ThreadUtil;

public class LinkedTransferQueueProducer implements Runnable {

	protected TransferQueue<String> blockingQueue;
	final Random random = new Random();

	public LinkedTransferQueueProducer(TransferQueue<String> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = UUID.randomUUID().toString();
				System.out.println("Put :" + data);
				blockingQueue.put(data);
				ThreadUtil.sleepThread(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

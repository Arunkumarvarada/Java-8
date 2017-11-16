package com.java4u.concurrency.common;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingDeque;

public class LinkedBlockingDequeProducer implements Runnable{
	protected BlockingDeque<String> blockingDeque;
	final Random random = new Random();

	public LinkedBlockingDequeProducer(BlockingDeque<String> blockingDeque) {
		this.blockingDeque = blockingDeque;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = UUID.randomUUID().toString();
				System.out.println("Put: " + data);
				blockingDeque.addFirst(data);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

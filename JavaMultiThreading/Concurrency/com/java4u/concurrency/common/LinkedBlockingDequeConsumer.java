package com.java4u.concurrency.common;

import java.util.concurrent.BlockingDeque;

public class LinkedBlockingDequeConsumer implements Runnable {
	protected BlockingDeque<String> blockingDeque;

	public LinkedBlockingDequeConsumer(BlockingDeque<String> blockingDeque) {
		this.blockingDeque = blockingDeque;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String data = blockingDeque.takeFirst();
				System.out.println(Thread.currentThread().getName() + " take() : " + data);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

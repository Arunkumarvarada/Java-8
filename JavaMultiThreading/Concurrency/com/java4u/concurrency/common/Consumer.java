package com.java4u.concurrency.common;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("#### Consumer Thread Started... ####");
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("#### Consumer Thread ended... ####");
	}

}

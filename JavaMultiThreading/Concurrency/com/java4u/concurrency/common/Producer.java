package com.java4u.concurrency.common;

import java.util.concurrent.BlockingQueue;

import com.java4u.multithreading.util.ThreadUtil;

public class Producer implements Runnable {
	BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("#### Producer Thread Started... ####");
		try {
			queue.put("1");
			ThreadUtil.sleepThread(1000);
			queue.put("2");
			ThreadUtil.sleepThread(1000);
			queue.put("3");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("#### Producer Thread ended... ####");
	}

}

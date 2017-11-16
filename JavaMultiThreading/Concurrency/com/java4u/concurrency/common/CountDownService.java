package com.java4u.concurrency.common;

import java.util.concurrent.CountDownLatch;

public class CountDownService implements Runnable {
	private int timeToStart;
	private String name;
	private final CountDownLatch latch;

	public CountDownService(int timeToStart, String name, CountDownLatch latch) {
		this.timeToStart = timeToStart;
		this.name = name;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(timeToStart);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " is Up");
		latch.countDown();
	}

}

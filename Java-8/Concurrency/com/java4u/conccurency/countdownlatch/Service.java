package com.java4u.conccurency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Service implements Runnable {

	private long timeToStart;
	private String name;
	private CountDownLatch latch;

	public Service(long timeToStart, String name, CountDownLatch latch) {
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

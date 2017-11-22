package com.java4u.executors.common;

import com.java4u.executors.util.ThreadUtil;

public class ValueReturningTaskA implements Runnable {
	private int a;
	private int b;
	private long sleepTime;
	private int sum;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private volatile boolean done = false;

	public ValueReturningTaskA(int a, int b, long sleepTime) {
		this.a = a;
		this.b = b;
		this.sleepTime = sleepTime;

		this.instanceNumber = ++count;
		this.taskId = "ValueReturnTaskA-" + instanceNumber;

	}

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("#### [" + currentThreadName + "] <" + taskId + "> STARTING #####");

		System.out.println("[" + currentThreadName + "] <" + taskId + "> Sleeping for " + sleepTime + "millls");

		ThreadUtil.sleepThread(sleepTime);

		sum = a + b;
		System.out.println("**** [" + currentThreadName + "] <" + taskId + "> DONE ****");
		done = true;
		synchronized (this) {
			System.out.println("[" + currentThreadName + "] < " + taskId + "> NOTIFYING.........");
			this.notifyAll();
		}
	}

	public int getSum() {
		if (!done) {
			synchronized (this) {
				System.out.println("[" + Thread.currentThread().getName() + "] ==== WAITING for result from " + taskId
						+ "... ====");
				try {
					this.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("[" + Thread.currentThread().getName() + "] ==== WOKEN-UP for " + taskId + "... ====");
		}
		return sum;
	}

}

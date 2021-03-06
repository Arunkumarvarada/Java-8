package com.java4u.multithreading.util;

public class ValueReturningTaskC implements Runnable {
	private int a;
	private int b;
	private long sleepTime;
	private int sum;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;

	public ValueReturningTaskC(int a, int b, long sleepTime) {
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

	}

	public int getSum() {
		return sum;
	}

}

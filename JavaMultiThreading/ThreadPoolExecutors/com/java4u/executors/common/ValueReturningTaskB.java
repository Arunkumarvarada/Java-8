package com.java4u.executors.common;

import com.java4u.multithreading.common.ResultListener;
import com.java4u.threadpool.util.ThreadUtil;

public class ValueReturningTaskB implements Runnable {
	private int a;
	private int b;
	private long sleepTime;
	private int sum;
	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private ResultListener<Integer> listener;

	public ValueReturningTaskB(int a, int b, long sleepTime, ResultListener<Integer> listener) {
		this.a = a;
		this.b = b;
		this.listener = listener;
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
		listener.notifyResult(sum);

	}

}

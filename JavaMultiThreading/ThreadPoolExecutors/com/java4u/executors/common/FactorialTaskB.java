package com.java4u.executors.common;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class FactorialTaskB implements Callable<Long> {

	private static int count = 0;
	private int instanceNumber;
	private String taskId;

	private long a;
	private long factorial;
	private long sleepTime;

	@Override
	public Long call() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> STATRING ##### ");

		factorial = 1L;

		for (int i = 1; i <= a; i++) {
			System.out.println(" [" + currentThreadName + "] < " + taskId + "> TICK TICK : " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(sleepTime);
			} catch (InterruptedException e) {
				System.out.println(
						" ***** [" + currentThreadName + "] < " + taskId + "> Sleep Interrupted. Cancelling....");
				factorial = -1L;
				break;
			}

		}
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> DONE ##### ");
		return factorial;

	}

	public FactorialTaskB(long a, long sleepTime) {
		this.a = a;
		this.sleepTime = sleepTime;
		this.instanceNumber = ++count;
		this.taskId = "LoopTaskG" + instanceNumber;

	}

}

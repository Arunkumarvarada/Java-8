package com.java4u.executors.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

import com.java4u.executors.util.ThreadUtil;

public class CalculationTaskD implements Callable<Integer> {
	private int a;
	private int b;
	private long sleepTime;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss.SSS");

	public CalculationTaskD(int a, int b, long sleepTime) {
		this.a = a;
		this.b = b;

		this.sleepTime = sleepTime;
		this.instanceNumber = ++count;
		this.taskId = "CalculationTaskD-" + instanceNumber;
	}

	@Override
	public Integer call() {
		Date startTime = new Date();
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("#### [" + currentThreadName + "] <" + taskId + "> STARTED AT : "
				+ dateFormatter.format(startTime) + " ###### ");

		System.out.println("[" + currentThreadName + "] <" + taskId + "> Sleeping for " + sleepTime + "millls");

		ThreadUtil.sleepThread(sleepTime);

		System.out.println("**** [" + currentThreadName + "] <" + taskId + "> Finished AT "
				+ dateFormatter.format(new Date()) + " ******* \n");

		return (a + b);

	}

}

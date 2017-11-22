package com.java4u.executors.common;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.java4u.executors.util.ThreadUtil;

public class ScheduleTaskB implements Runnable {

	private long sleepTime;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss.SSS");

	public ScheduleTaskB(long sleepTime) {

		this.sleepTime = sleepTime;

		this.instanceNumber = ++count;
		this.taskId = "ScheduleTaskB-" + instanceNumber;

	}

	@Override
	public void run() {
		Date startTime = new Date();

		String currentThreadName = Thread.currentThread().getName();
		System.out.println("#### [" + currentThreadName + "] <" + taskId + "> STARTED AT : "
				+ dateFormatter.format(startTime) + " #####");

		System.out.println("[" + currentThreadName + "] <" + taskId + "> Sleeping for " + sleepTime + "millls");

		ThreadUtil.sleepThread(sleepTime);

		System.out.println("**** [" + currentThreadName + "] <" + taskId + "> FINISHED AT:"
				+ dateFormatter.format(new Date()) + " *******\n");

	}

}

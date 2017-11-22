package com.java4u.multithreading.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class ScheduleTaskA extends TimerTask {

	private long sleepTime;

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss.SSS");

	public ScheduleTaskA(long sleepTime) {

		this.sleepTime = sleepTime;

		this.instanceNumber = ++count;
		this.taskId = "ScheduleTaskA-" + instanceNumber;

	}

	@Override
	public void run() {
		Date startTime = new Date();
		Date scheduledForRunningTime = new Date(super.scheduledExecutionTime());

		String currentThreadName = Thread.currentThread().getName();
		System.out.println("#### [" + currentThreadName + "] <" + taskId + "> SCHEDULED TO RUN AT : "
				+ dateFormatter.format(scheduledForRunningTime) + ", ACTUALLY STARTED AT : "
				+ dateFormatter.format(startTime) + " #####");

		System.out.println("[" + currentThreadName + "] <" + taskId + "> Sleeping for " + sleepTime + "millls");

		ThreadUtil.sleepThread(sleepTime);

		System.out.println("**** [" + currentThreadName + "] <" + taskId + "> FINISHED AT:"
				+ dateFormatter.format(new Date()) + " *******\n");

	}

}

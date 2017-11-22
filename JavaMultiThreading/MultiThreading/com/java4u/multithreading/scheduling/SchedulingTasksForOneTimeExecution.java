package com.java4u.multithreading.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import com.java4u.multithreading.util.ScheduleTaskA;
import com.java4u.multithreading.util.TimeUtils;

public class SchedulingTasksForOneTimeExecution {

	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS");
	
	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");

		Timer timer = new Timer("Timer-Thread", true);
		Date currentTime = new Date();
		System.out.println("[" + currentThreadName + "] Current time : " + dateFormatter.format(currentTime));

		Date scheduledTime = TimeUtils.getFutureTime(currentTime, 3000);
		long intervalMillis = 2000;

		timer.scheduleAtFixedRate(new ScheduleTaskA(1000), scheduledTime, intervalMillis);

		System.out.println(
				"[" + currentThreadName + "] Task-1 first scheduled for  : " + dateFormatter.format(scheduledTime)
						+ " and thern repeatedly at an interval of every" + intervalMillis / 1000 + " seconds!");

		
		
		// ########################################################################################################### //
		
		long delayMillis= 4000;
		long intervalMillis2= 2000;
		
		timer.scheduleAtFixedRate(new ScheduleTaskA(1000), delayMillis, intervalMillis2);
		
		System.out.println(
				"[" + currentThreadName + "] Task-2 first scheduled for  : " + dateFormatter.format(scheduledTime)
						+ " and thern repeatedly at an interval of every" + intervalMillis / 1000 + " seconds!");
		TimeUnit.MILLISECONDS.sleep(16000);
		System.out.println("[" + currentThreadName + "] CANCELLING THE TIMER NOW.....");
		timer.cancel();
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}

}

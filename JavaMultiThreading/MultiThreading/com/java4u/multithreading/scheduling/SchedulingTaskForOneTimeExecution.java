package com.java4u.multithreading.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import com.java4u.multithreading.util.ScheduleTaskA;
import com.java4u.multithreading.util.TimeUtils;

public class SchedulingTaskForOneTimeExecution {

	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS");

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");
		
		Timer timer = new Timer("Timer-Thread", true);
		Date currentTime = new Date();
		Date scheduledTime = TimeUtils.getFutureTime(currentTime, 5000);
		
		System.out.println("[" + currentThreadName + "] Current time : " + dateFormatter.format(currentTime));
		
		timer.schedule(new ScheduleTaskA(8000), scheduledTime);
		
		System.out.println("[" + currentThreadName + "] Task-1 scheduled for running at SPECIFIED TIME : " +
				dateFormatter.format(scheduledTime));
		
		//*******************************************************************************************//
		
		long delayMillis = 10000;
		ScheduleTaskA task2 = new ScheduleTaskA(4000);
		
		timer.schedule(task2, delayMillis);
		
		System.out.println("[" + currentThreadName + "] Task-2 scheduled to run " + delayMillis/1000 +
				" seconds INITIAL-DELAY after current-time i.e. at " + dateFormatter.format(
				new Date(task2.scheduledExecutionTime())));
		
		//*******************************************************************************************//
		
		long delayMillis2 = 12000;
		ScheduleTaskA task3 = new ScheduleTaskA(0);
		
		timer.schedule(task3, delayMillis2);
		
		System.out.println("[" + currentThreadName + "] Task-3 scheduled to run " + delayMillis2/1000 +
				" seconds INITIAL-DELAY after current-time i.e. at " + dateFormatter.format(
				new Date(task3.scheduledExecutionTime())));
		
		//*******************************************************************************************//
		
		Date scheduledTime2 = TimeUtils.getFutureTime(currentTime, 30000);
		ScheduleTaskA task4 = new ScheduleTaskA(0);
		
		timer.schedule(task4, scheduledTime2);
		
		System.out.println("[" + currentThreadName + "] Task-4 scheduled for running at SPECIFIED TIME : " +
				dateFormatter.format(new Date(task4.scheduledExecutionTime())));

		//task4.cancel();
		
		//*******************************************************************************************//
		
		TimeUnit.MILLISECONDS.sleep(32000);
		System.out.println("[" + currentThreadName + "] CANCELLING THE TIMER NOW ...");
		timer.cancel();
		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");

	}

}

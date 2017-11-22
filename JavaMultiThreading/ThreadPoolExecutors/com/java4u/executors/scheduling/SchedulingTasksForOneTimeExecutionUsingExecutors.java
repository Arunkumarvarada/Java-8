package com.java4u.executors.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.java4u.executors.common.CalculationTaskD;
import com.java4u.executors.common.NamedThreadFactory;
import com.java4u.executors.common.ScheduleTaskB;

public class SchedulingTasksForOneTimeExecutionUsingExecutors {

	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS");

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3,
				new NamedThreadFactory());

		System.out.println("[" + currentThreadName + "]current time is :: " + dateFormatter.format(new Date()));

		ScheduledFuture<?> scheduledFuture1 = scheduledExecutorService.schedule(new ScheduleTaskB(0), 6,
				TimeUnit.SECONDS);
		ScheduledFuture<Integer> scheduledFuture2 = scheduledExecutorService.schedule(new CalculationTaskD(5, 4, 0), 10,
				TimeUnit.SECONDS);
		scheduledExecutorService.schedule(new ScheduleTaskB(0), 8, TimeUnit.SECONDS);

		ScheduledFuture<Integer> scheduledFuture4 = scheduledExecutorService.schedule(new CalculationTaskD(9, 4, 0), 10,
				TimeUnit.SECONDS);

		
		scheduledExecutorService.shutdown();

		scheduledFuture1.cancel(true);
		scheduledFuture2.cancel(true);
		System.out.println("[" + currentThreadName + "] RETRIEVING THE RESULTS NOW ....\n");

		//System.out.println("[" + currentThreadName + "] TASK-1 RESULT= " + scheduledFuture1.get() + "\n");
		//System.out.println("[" + currentThreadName + "] TASK-2 RESULT= " + scheduledFuture2.get() + "\n");
		System.out.println("[" + currentThreadName + "] TASK-4 RESULT= " + scheduledFuture4.get() + "\n");

		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}

}

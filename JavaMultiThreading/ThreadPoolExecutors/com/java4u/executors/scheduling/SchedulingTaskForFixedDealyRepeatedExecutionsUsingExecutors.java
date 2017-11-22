package com.java4u.executors.scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.java4u.executors.common.NamedThreadFactory;
import com.java4u.executors.common.ScheduleTaskB;
import com.java4u.multithreading.util.TimeUtils;

public class SchedulingTaskForFixedDealyRepeatedExecutionsUsingExecutors {
	private static SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss:SSS");

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3,
				new NamedThreadFactory());

		System.out.println("[" + currentThreadName + "] Current Time is : " + dateFormatter.format(new Date()));
		ScheduledFuture<?> scheduledFuture1 = scheduledExecutorService.scheduleWithFixedDelay(new ScheduleTaskB(1000),
				4, 2, TimeUnit.SECONDS);
		ScheduledFuture<?> scheduledFuture2 = scheduledExecutorService.scheduleWithFixedDelay(new ScheduleTaskB(1000),
				4, 2, TimeUnit.SECONDS);

		/*
		 * for(int i=0; i<10; i++) { System.out.print("[" + currentThreadName +
		 * "] Next Run is scheduled at approx. "); Date scheduleTime=
		 * TimeUtils.getFutureTime(new Date(),
		 * scheduledFuture1.getDelay(TimeUnit.MILLISECONDS));
		 * System.out.println(dateFormatter.format(scheduleTime));
		 * TimeUnit.MILLISECONDS.sleep(3000); }
		 */
		scheduledFuture2.cancel(true);
		TimeUnit.MILLISECONDS.sleep(15000);
		scheduledExecutorService.shutdown();

		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}

}

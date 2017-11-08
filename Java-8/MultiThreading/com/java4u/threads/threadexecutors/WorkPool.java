package com.java4u.threads.threadexecutors;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkPool {

	public static void main(String[] args) throws InterruptedException {
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();

		ThreadFactory thrteadFactory = Executors.defaultThreadFactory();

		ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS,
				new ArrayBlockingQueue<Runnable>(2), thrteadFactory, rejectionHandler);

		MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);

		Thread monitorThread = new Thread(monitor);
		monitorThread.start();

		// submit Work to thread pool
		for (int i = 0; i < 10; i++) {
			executorPool.execute(new WorkThread("command " + i));
		}

		Thread.sleep(1000);
		executorPool.shutdown();
		Thread.sleep(5000);
		monitor.shutdown();
	}

}

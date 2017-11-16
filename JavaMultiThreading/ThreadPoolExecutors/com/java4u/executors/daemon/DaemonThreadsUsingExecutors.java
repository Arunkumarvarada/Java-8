package com.java4u.executors.daemon;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.DaemonThreadFactory;
import com.java4u.multithreading.util.LoopTaskD;

public class DaemonThreadsUsingExecutors {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] Main thread starts here");

		ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
		executorService.execute(new LoopTaskD(100));
		executorService.execute(new LoopTaskD(200));
		executorService.execute(new LoopTaskD(300));
		executorService.execute(new LoopTaskD(400));

		executorService.shutdown();
		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

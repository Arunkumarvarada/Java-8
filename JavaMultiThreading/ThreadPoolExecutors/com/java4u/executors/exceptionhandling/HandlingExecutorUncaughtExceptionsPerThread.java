package com.java4u.executors.exceptionhandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.ThreadFactoryWithExceptionHandler;
import com.java4u.multithreading.common.ExceptionLeakingTask;

public class HandlingExecutorUncaughtExceptionsPerThread {
	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here");

		ExecutorService executorService = Executors.newCachedThreadPool(new ThreadFactoryWithExceptionHandler());

		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());

		executorService.shutdown();
		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}
}

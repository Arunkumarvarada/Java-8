package com.java4u.executors.exceptionhandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.ThreadExceptionHandler;
import com.java4u.executors.common.ThreadFactoryWithExceptionHandlerAlternate;
import com.java4u.executors.common.ExceptionLeakingTask;

public class HandlingExecutorDefaultAndSpecificHandlerExceptionInThreads {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here");

		Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler("THE_DEFAULT_ONE"));

		ExecutorService executorService = Executors
				.newCachedThreadPool(new ThreadFactoryWithExceptionHandlerAlternate());

		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());

		executorService.shutdown();

		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

package com.java4u.executors.exceptionhandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.ExceptionLeakingTask;
import com.java4u.executors.common.ThreadExceptionHandler;

public class HandlingExecutorUncaughtExceptionForEveryThread {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here");

		Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler("DEFAULT_HANDLER"));

		ExecutorService executorService1= Executors.newCachedThreadPool();
		executorService1.execute(new ExceptionLeakingTask());
		executorService1.execute(new ExceptionLeakingTask());
		executorService1.execute(new ExceptionLeakingTask());
		

		ExecutorService executorService2= Executors.newCachedThreadPool();
		executorService2.execute(new ExceptionLeakingTask());
		executorService2.execute(new ExceptionLeakingTask());
		executorService2.execute(new ExceptionLeakingTask());
		
		executorService1.shutdown();
		executorService2.shutdown();
		
		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

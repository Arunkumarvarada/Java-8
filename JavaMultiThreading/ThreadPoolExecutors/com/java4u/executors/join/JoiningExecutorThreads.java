package com.java4u.executors.join;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.LoopTaskI;
import com.java4u.executors.common.NamedThreadFactory;

public class JoiningExecutorThreads {

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here");

		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
		CountDownLatch downSignal = new CountDownLatch(4);

		executorService.execute(new LoopTaskI(downSignal));
		executorService.execute(new LoopTaskI(downSignal));
		executorService.execute(new LoopTaskI(downSignal));
		executorService.execute(new LoopTaskI(downSignal));

		executorService.shutdown();

		downSignal.await();
		System.out.println("[" + currentThreadName + "]" + currentThreadName + " GOT THE SIGNAL TO CONTINUE....");
		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

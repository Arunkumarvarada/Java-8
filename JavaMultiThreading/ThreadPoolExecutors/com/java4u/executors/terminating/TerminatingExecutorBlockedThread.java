package com.java4u.executors.terminating;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.java4u.executors.common.FactorialTaskB;
import com.java4u.executors.common.LoopTaskA;
import com.java4u.executors.common.LoopTaskG;
import com.java4u.executors.common.NamedThreadFactory;

public class TerminatingExecutorBlockedThread {

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] Main thread starts here");

		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());

		LoopTaskA task1 = new LoopTaskA();
		LoopTaskG task2 = new LoopTaskG();
		FactorialTaskB task3 = new FactorialTaskB(30, 1000);

		Future<?> f1 = executorService.submit(task1);
		Future<?> f2 = executorService.submit(task2);
		Future<?> f3 = executorService.submit(task3);

		TimeUnit.MILLISECONDS.sleep(2000);
		executorService.shutdown();
		System.out.println("[" + currentThreadName + "] Invoking cancel() on all the tasks .....");
		f1.cancel(true);
		f2.cancel(true);
		f3.cancel(true);
		System.out.println("[" + currentThreadName + "] Main thread ends here");
	}

}

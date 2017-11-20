package com.java4u.executors.terminating;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.java4u.executors.common.FactorialTaskA;
import com.java4u.executors.common.LoopTaskE;
import com.java4u.executors.common.NamedThreadFactory;

public class TerminatingExecutorFirstWay {

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] Main thread starts here");
		
		ExecutorService executorService= Executors.newCachedThreadPool(new NamedThreadFactory());
		LoopTaskE task1= new LoopTaskE();
		FactorialTaskA task2= new FactorialTaskA(30, 1000);
		
		executorService.execute(task1);
		executorService.submit(task2);
		executorService.shutdown();
		
		TimeUnit.MILLISECONDS.sleep(3000);
		task1.cancel();
		task2.cancel();
		
		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

package com.java4u.exeutors.isalive;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

import com.java4u.executors.common.CalculationTaskA;
import com.java4u.executors.common.LoopTaskC;
import com.java4u.executors.common.NamedThreadFactory;

public class ExecutorThreadAliveCheck {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here");

		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());

		Future<?> f1 = executorService.submit(new LoopTaskC());
		Future<Integer> f2 = executorService.submit(new CalculationTaskA(3, 4, 700));

		FutureTask<?> ft3= new FutureTask<Void>(new LoopTaskC(), null);
		FutureTask<Integer> ft4= new FutureTask<Integer>(new LoopTaskC(), 999);
		FutureTask<Integer> ft5= new FutureTask<Integer>(new CalculationTaskA(4,5,500));
		
		executorService.submit(ft3);
		executorService.submit(ft4);
		executorService.submit(ft5);
		
		executorService.shutdown();
		
		for (int i = 0; i <= 5; i++) {
			TimeUnit.MILLISECONDS.sleep(600);
			System.out.println("[" + currentThreadName + "] ITR-: " + i + "-> Is LoopTaskC-1  " + f1.isDone());
			System.out.println("[" + currentThreadName + "] ITR-: " + i + "-> Is CalculationTaskA-1  " + f1.isDone());
			
			System.out.println("[" + currentThreadName + "] ITR-: " + i + "-> Is LoopTaskC-2  " + ft3.isDone());
			System.out.println("[" + currentThreadName + "] ITR-: " + i + "-> Is LoopTaskC-3  " + ft4.isDone());
			System.out.println("[" + currentThreadName + "] ITR-: " + i + "-> Is CalculationTaskA-2  " + ft5.isDone());
		}
		System.out.println("\n ###### [" + currentThreadName + "] Retriving the results now..... ######## ");
		
		System.out.println("[" + currentThreadName + "] LoopTaskA-1 result =" + f1.get());
		System.out.println("[" + currentThreadName + "] CalculationTaskA-1 result =" + f2.get());
		
		System.out.println("[" + currentThreadName + "] LoopTaskA-2 result =" + ft3.get());
		System.out.println("[" + currentThreadName + "] LoopTaskA-3 result =" + ft4.get());
		System.out.println("[" + currentThreadName + "] CalculationTaskA-2 result =" + ft5.get());
		
		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

package com.java4u.executors.terminating;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.java4u.executors.common.CalculationTaskB;
import com.java4u.executors.common.CalculationTaskC;
import com.java4u.executors.common.FactorialTaskB;
import com.java4u.executors.common.LoopTaskA;
import com.java4u.executors.common.LoopTaskF;
import com.java4u.executors.common.NamedThreadFactory;
import com.java4u.executors.common.TaskResult;

public class TerminatingAllExecutorTasks {

	public static void main(String[] args) throws Exception {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here");

		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());

		LoopTaskA task1 = new LoopTaskA();
		LoopTaskF task2 = new LoopTaskF();
		FactorialTaskB task3 = new FactorialTaskB(30, 2000);
		CalculationTaskC task4 = new CalculationTaskC();
		CalculationTaskB task5 = new CalculationTaskB(2, 3, 9000);

		executorService.submit(task1);
		executorService.submit(task2);
		Future<Long> t3future = executorService.submit(task3);
		Future<Long> t4future = executorService.submit(task4);
		Future<TaskResult<String, Integer>> t5future = executorService.submit(task5);

		TimeUnit.MILLISECONDS.sleep(2000);

		executorService.shutdownNow();

		System.out.println("[" + currentThreadName + "] 'FactorialTaskB-1' Result = " + t3future.get());
		System.out.println("[" + currentThreadName + "] 'CalculationTaskC-1' Result = " + t4future.get());
		try {
			System.out.println("[" + currentThreadName + "] 'CalculationTaskB-1' Result = " + t5future.get());
		} catch (ExecutionException ee) {
			System.out.println("[" + currentThreadName + "] 'CalculationTaskC-1' Result = Got Exception");
			ee.getCause().printStackTrace();
		}
		System.out.println("[" + currentThreadName + "] All threads are Terminated ="
				+ executorService.awaitTermination(5000, TimeUnit.MILLISECONDS));

		System.out.println("[" + currentThreadName + "] Main thread ends here");
	}

}

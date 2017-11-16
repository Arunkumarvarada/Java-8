package com.java4u.executors.retval;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.CalculationTaskB;
import com.java4u.executors.common.LoopTaskA;
import com.java4u.executors.common.NamedThreadFactory;
import com.java4u.executors.common.TaskResult;

public class ReturningValueUsingExecutorSecondWay {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();

		System.out.println("[" + currentThreadName + "] Main thread starts here");
		ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());

		CompletionService<TaskResult<String, Integer>> tasks = new ExecutorCompletionService<TaskResult<String, Integer>>(
				executorService);
		tasks.submit(new CalculationTaskB(2, 4, 2000));
		tasks.submit(new CalculationTaskB(5, 44, 1000));
		tasks.submit(new CalculationTaskB(5, 4, 500));

		tasks.submit(new LoopTaskA(), new TaskResult<String, Integer>("LoopTaskA-1", 999));

		executorService.shutdown();

		for (int i = 0; i < 4; i++) {
			try {
				System.out.println("Result : " + tasks.take().get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

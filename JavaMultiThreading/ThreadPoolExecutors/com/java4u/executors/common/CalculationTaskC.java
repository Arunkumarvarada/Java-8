package com.java4u.executors.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class CalculationTaskC implements Callable<Long> {

	private final int DATA_SIZE = 100000;
	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private boolean isthreadInterupted = false;

	@Override
	public Long call() throws Exception {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> STATRING ##### ");

		long totalTimeTakenInMillis = 0;
		for (int i = 0; i < 1000; i++) {
			System.out.println("[" + currentThreadName + "] < " + taskId + "> CURRENT RUNNING AVERAGE ="
					+ (i == 0 ? 0 : totalTimeTakenInMillis / (2 * i)));

			doSomeWork();

			if (Thread.interrupted()) {
				System.out.println("##### [" + currentThreadName + "] < " + taskId + "> Interuppted. Cancelled");
				isthreadInterupted = true;
				break;
			}
		}
		System.out.println("##### [" + currentThreadName + "] < " + taskId
				+ "> Retrieving Interuppted. Status again.... " + Thread.interrupted());
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> DONE ##### ");
		return isthreadInterupted ? -1 : totalTimeTakenInMillis / (2 * 1000);

	}

	private long doSomeWork() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 2; i++) {
			Collections.sort(generateDataSet());
		}
		return System.currentTimeMillis() - startTime;
	}

	private List<Integer> generateDataSet() {
		List<Integer> intList = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < DATA_SIZE; i++) {
			intList.add(random.nextInt(DATA_SIZE));
		}
		return intList;
	}

	public CalculationTaskC() {
		this.instanceNumber = ++count;
		this.taskId = "LoopTaskF" + instanceNumber;

	}

}

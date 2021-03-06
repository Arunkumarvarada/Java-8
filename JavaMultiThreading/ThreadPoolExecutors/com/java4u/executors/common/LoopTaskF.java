package com.java4u.executors.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LoopTaskF implements Runnable {

	private final int DATA_SIZE = 100000;
	private static int count = 0;
	private int instanceNumber;
	private String taskId;

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println();
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> STATRING ##### ");
		for (int i = 1;; i--) {
			System.out.println(" [" + currentThreadName + "] < " + taskId + "> TICK TICK : " + i);
			doSomeWork();

			if (Thread.interrupted()) {
				System.out.println("##### [" + currentThreadName + "] < " + taskId + "> Interuppted. Cancelled");
				break;
			}
		}
		System.out.println("##### [" + currentThreadName + "] < " + taskId
				+ "> Retrieving Interuppted. Status again.... " + Thread.interrupted());
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> DONE ##### ");

	}

	private void doSomeWork() {
		for (int i = 0; i < 2; i++) {
			Collections.sort(generateDataSet());
		}
	}

	private List<Integer> generateDataSet() {
		List<Integer> intList = new ArrayList<>();
		Random random = new Random();

		for (int i = 0; i < DATA_SIZE; i++) {
			intList.add(random.nextInt(DATA_SIZE));
		}
		return intList;
	}

	public LoopTaskF() {
		this.instanceNumber = ++count;
		this.taskId = "LoopTaskF" + instanceNumber;

	}

}

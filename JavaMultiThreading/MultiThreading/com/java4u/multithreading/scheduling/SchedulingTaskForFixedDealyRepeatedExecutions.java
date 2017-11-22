package com.java4u.multithreading.scheduling;

public class SchedulingTaskForFixedDealyRepeatedExecutions {

	public static void main(String[] args) {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here...");

		
		System.out.println("[" + currentThreadName + "] Main thread ends here...");
	}

}

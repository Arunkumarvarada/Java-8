package com.java4u.executors.common;

public class LoopTaskG implements Runnable {

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
			try {
				Thread.sleep((long) (Math.random() * 3000));
			} catch (InterruptedException e) {
				System.out.println("***** [" + currentThreadName + "] < " + taskId + "> Sleep Interuppted.... ");
				break;
			}

		}
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> DONE ##### ");

	}

	public LoopTaskG() {
		this.instanceNumber = ++count;
		this.taskId = "LoopTaskG" + instanceNumber;

	}

}

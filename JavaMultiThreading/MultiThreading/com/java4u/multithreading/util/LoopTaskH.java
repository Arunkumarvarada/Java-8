package com.java4u.multithreading.util;

public class LoopTaskH implements Runnable {

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	boolean sleepInteruppted = false;

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
				sleepInteruppted = true;
			}

			doSomeMoreWork();
			if (sleepInteruppted || Thread.interrupted()) {
				System.out.println(
						" ***** [" + currentThreadName + "] < " + taskId + "> INTERUPPTED... Cancelling ....... ");
				break;
			}
		}
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> DONE ##### ");

	}

	private void doSomeMoreWork() {
		System.out.println(
				" ***** [" + Thread.currentThread().getName() + "] < " + taskId + "> DOINg SOME MORE WORK .... ");

	}

	public LoopTaskH() {
		this.instanceNumber = ++count;
		this.taskId = "LoopTaskH" + instanceNumber;

	}

}

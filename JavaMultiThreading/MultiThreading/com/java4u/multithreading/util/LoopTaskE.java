package com.java4u.multithreading.util;

public class LoopTaskE implements Runnable {

	private static int count = 0;
	private int instanceNumber;
	private String taskId;
	private volatile boolean shutdown = false;

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println();
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> STATRING ##### ");
		for (int i = 1; ; i--) {
			System.out.println(" [" + currentThreadName + "] < " + taskId + "> TICK TICK : " + i);
			try {
				Thread.sleep((long) (Math.random() * 3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (this) {
				if(shutdown) {
					break;
				}
			}
		}
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> DONE ##### ");

	}

	public void cancel() {
		System.out.println("******* [" + Thread.currentThread().getName() + " ] <" + taskId + "> DONE ******** ");

		synchronized (this) {
			this.shutdown = true;
		}
	}

	public LoopTaskE() {
		this.instanceNumber = ++count;
		this.taskId = "LoopTaskE" + instanceNumber;

	}

}

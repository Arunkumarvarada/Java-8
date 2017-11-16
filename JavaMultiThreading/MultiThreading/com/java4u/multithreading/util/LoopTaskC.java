package com.java4u.multithreading.util;

public class LoopTaskC implements Runnable {

	private static int count = 0;
	private int instanceNumber;
	private String taskId;

	@Override
	public void run() {

		System.out.println();
		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + "> STATRING ##### ");
		for (int i = 10; i > 0; i--) {
			System.out.println(" [" + Thread.currentThread().getName() + "] < " + taskId + "> TICK TICK : " + i);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("##### [" + Thread.currentThread().getName() + "] < " + taskId + "> DONE ##### ");

	}

	public LoopTaskC() {
		this.instanceNumber = ++count;
		this.taskId="LoopTaskC" + instanceNumber;

	}

}

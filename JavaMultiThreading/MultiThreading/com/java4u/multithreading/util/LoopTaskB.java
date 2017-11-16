package com.java4u.multithreading.util;

public class LoopTaskB implements Runnable {

	private static int count = 0;
	private int id;
	private String taskId;

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println();
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> STATRING ##### ");
		for (int i = 10; i > 0; i--) {
			System.out.println(" [" + currentThreadName + "] < " + taskId + "> TICK TICK : " + i);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("##### [" + currentThreadName + "] < " + taskId + "> DONE ##### ");

	}

	public LoopTaskB() {
		this.id = ++count;
		this.taskId="LoopTaskB" + id;

	}

}

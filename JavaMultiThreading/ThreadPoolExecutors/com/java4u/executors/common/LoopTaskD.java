package com.java4u.executors.common;

public class LoopTaskD implements Runnable {

	private static int count = 0;
	private int id;
	private String taskId;
	private long sleepTime;

	@Override
	public void run() {
		boolean isRunningInDaemonThread = Thread.currentThread().isDaemon();
		String threadType = isRunningInDaemonThread ? "DAEMON" : "USER";

		String currentThreadName = Thread.currentThread().getName();
		System.out.println();
		System.out.println("##### [" + currentThreadName + "," + threadType + "] < " + taskId + "> STATRING ##### ");
		for (int i = 10; i > 0; i--) {
			System.out.println(" [" + currentThreadName + "," + threadType + "] < " + taskId + "> TICK TICK : " + i);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("##### [" + currentThreadName + "," + threadType + "] < " + taskId + "> DONE ##### ");

	}

	public LoopTaskD(long sleepTime) {
		this.sleepTime= sleepTime;
		this.id = ++count;
		this.taskId = "LoopTaskD" + id;

	}

}

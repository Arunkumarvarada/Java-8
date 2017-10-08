package com.java4u.threads.methods;

public class ThreadPriorityDemo extends Thread {

	public void run() {
		System.out.println("Name of the Thread running " + currentThread().getName());
		System.out.println("Priority of the Thread running " + currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriorityDemo t1 = new ThreadPriorityDemo();
		ThreadPriorityDemo t2 = new ThreadPriorityDemo();
		ThreadPriorityDemo t3 = new ThreadPriorityDemo();
		t1.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t3.start();
		t2.start();

	}

}

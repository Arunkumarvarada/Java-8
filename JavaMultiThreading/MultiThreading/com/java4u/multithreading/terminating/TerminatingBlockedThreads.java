package com.java4u.multithreading.terminating;

import java.util.concurrent.TimeUnit;

import com.java4u.multithreading.util.LoopTaskG;
import com.java4u.multithreading.util.LoopTaskH;

public class TerminatingBlockedThreads {

	public static void main(String[] args) throws InterruptedException {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println("[" + currentThreadName + "] Main thread starts here");

		LoopTaskG task1 = new LoopTaskG();
		LoopTaskG task2 = new LoopTaskG();
		LoopTaskG task3 = new LoopTaskG();

		LoopTaskH task4 = new LoopTaskH();
		LoopTaskH task5 = new LoopTaskH();

		Thread t1 = new Thread(task1, "MyThread-1");
		t1.start();
		Thread t2 = new Thread(task2, "MyThread-2");
		t2.start();
		Thread t3 = new Thread(task3, "MyThread-3");
		t3.start();

		Thread t4 = new Thread(task4, "MyThread-4");
		t4.start();
		Thread t5 = new Thread(task5, "MyThread-5");
		t5.start();

		TimeUnit.MILLISECONDS.sleep(3000);

		System.out.println("[" + currentThreadName + "] Interuppting " + t1.getName() + " ....");
		t1.interrupt();

		System.out.println("[" + currentThreadName + "] Interuppting " + t2.getName() + " ....");
		t2.interrupt();

		System.out.println("[" + currentThreadName + "] Interuppting " + t3.getName() + " ....");
		t3.interrupt();

		System.out.println("[" + currentThreadName + "] Interuppting " + t4.getName() + " ....");
		t4.interrupt();

		System.out.println("[" + currentThreadName + "] Interuppting " + t5.getName() + " ....");
		t5.interrupt();

		System.out.println("[" + currentThreadName + "] Main thread ends here");

	}

}

package com.java4u.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

import com.java4u.threads.util.ThreadUtil;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {

			@Override
			public void run() {
				System.out.println("All the parities are arrived at barrier, lets play");
			}
		});

		Thread t1 = new Thread(new Task(cyclicBarrier), "Thread 1");
		Thread t2 = new Thread(new Task(cyclicBarrier), "Thread 2");
		Thread t3 = new Thread(new Task(cyclicBarrier), "Thread 3");

		t1.start();
		ThreadUtil.sleep(1000);
		t2.start();
		ThreadUtil.sleep(1000);
		t3.start();
		ThreadUtil.sleep(1000);
	}

}

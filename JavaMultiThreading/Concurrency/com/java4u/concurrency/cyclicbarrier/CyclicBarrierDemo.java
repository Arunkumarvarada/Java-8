package com.java4u.concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

import com.java4u.concurrency.common.CyclicBarrierTask;
import com.java4u.multithreading.util.ThreadUtil;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		final CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {

			@Override
			public void run() {
				System.out.println("All parties are arrived at the barrier, lets play");
			}
		});

		new Thread(new CyclicBarrierTask(cyclicBarrier), "Thread - 1").start();
		ThreadUtil.sleepThread(4000);
		new Thread(new CyclicBarrierTask(cyclicBarrier), "Thread - 2").start();
		ThreadUtil.sleepThread(4000);
		new Thread(new CyclicBarrierTask(cyclicBarrier), "Thread - 3").start();

	}

}

package com.java4u.multithreading.coding.wait_notify1;

public class OddEvenRunnable implements Runnable {
	public int PRINT_UPTO_NUMBER = 10;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	public OddEvenRunnable(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number < PRINT_UPTO_NUMBER) {
			synchronized (lock) {
				while (number % 2 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

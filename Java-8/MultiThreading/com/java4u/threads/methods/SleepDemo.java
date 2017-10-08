package com.java4u.threads.methods;

public class SleepDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Sleeping thread Demo Starts");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Sleeping Thread Demo ends");
	}

	public static void main(String[] args) {
		System.out.println("Sleeping Thread Demo --> Starts");
		Thread thread = new Thread(new SleepDemo());
		Thread thread1 = new Thread(new SleepDemo());
		thread.start();
		thread1.start();
		System.out.println("Sleeping Thread Demo --> Ends");
	}

}

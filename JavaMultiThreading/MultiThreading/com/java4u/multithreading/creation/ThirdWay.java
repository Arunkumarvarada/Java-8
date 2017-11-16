package com.java4u.multithreading.creation;

public class ThirdWay {

	public static void main(String[] args) {
		System.out.println("Starting the main thread");

		new ThirdTask();
		new ThirdTask();
		System.out.println("Ending the main thread");

	}
}

class ThirdTask implements Runnable {
	private static int count = 0;
	private int id;

	public ThirdTask() {
		this.id = ++count;
		new Thread(this).start();
	}

	public void run() {
		for (int i = 10; i > 0; i--) {
			System.out.println("<" + id + "> TICK TICK : " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
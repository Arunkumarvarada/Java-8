package com.java4u.multithreading.creation;

public class SecondWay {

	public static void main(String[] args) {
		System.out.println("Starting the main thread");

		new SecondTask().start();
		Thread t1 = new SecondTask();
		t1.start();
		System.out.println("Ending the main thread");

	}
}

class SecondTask extends Thread {
	private static int count = 0;
	private int id;

	public SecondTask() {
		this.id = ++count;
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
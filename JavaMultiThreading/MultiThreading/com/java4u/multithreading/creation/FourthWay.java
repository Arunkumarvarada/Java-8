package com.java4u.multithreading.creation;

public class FourthWay {

	public static void main(String[] args) {
		System.out.println("Starting the main thread");

		Thread t1 = new SecondTask();
		Thread t2 = new SecondTask();
		t1.start();
		t2.start();
		System.out.println("Ending the main thread");

	}

}

class FourthTask implements Runnable {
	private static int count = 0;
	private int id;

	public FourthTask() {
		this.id = ++count;

	}

	@Override
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

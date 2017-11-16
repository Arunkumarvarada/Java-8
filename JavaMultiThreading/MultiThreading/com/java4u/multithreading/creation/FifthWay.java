package com.java4u.multithreading.creation;

public class FifthWay {

	public static void main(String[] args) {
		System.out.println("Starting the main thread");
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10; i > 0; i--) {
					System.out.println(" TICK TICK : " + i);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		t1.start();
		System.out.println("Ending the main thread");

	}
}

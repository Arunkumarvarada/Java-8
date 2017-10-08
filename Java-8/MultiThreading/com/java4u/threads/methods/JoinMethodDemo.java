package com.java4u.threads.methods;

public class JoinMethodDemo extends Thread {

	public void run() {
		System.out.println("Start of thread execution");
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
		System.out.println("End of thread execution");
	}

	public static void main(String[] args) {
		JoinMethodDemo thread1 = new JoinMethodDemo();
		JoinMethodDemo thread2 = new JoinMethodDemo();
		JoinMethodDemo thread3 = new JoinMethodDemo();

		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		thread2.start();
		thread3.start();
	}

}

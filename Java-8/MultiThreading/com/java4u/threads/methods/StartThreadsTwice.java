package com.java4u.threads.methods;

public class StartThreadsTwice extends Thread {

	public void run() {
		System.out.println("Starting Thread Twice");
	}

	public static void main(String[] args) {
		StartThreadsTwice thread = new StartThreadsTwice();
		thread.start();
		thread.start();

	}

}

package com.java4u.threads.methods;

public class NamingThread extends Thread {

	public void run() {
		System.out.println("Running the thread.......");
	}

	public static void main(String[] args) {
		NamingThread t1 = new NamingThread();
		NamingThread t2 = new NamingThread();

		System.out.println("Name of the Thread " + t1.getName());
		System.out.println("Name of the Thread " + t2.getName());

		t1.start();
		t2.start();
		t1.setName("Test 1");
		t2.setName("Test 2");

		System.out.println("Name of the Thread " + t1.getName());
		System.out.println("Name of the Thread " + t2.getName());

	}
}

package com.java4u.multithreading.coding.wait_notify1;

public class PrintEvenOdd {

	public static void main(String[] args) {
		OddEvenRunnable oddRunnable = new OddEvenRunnable(1);
		OddEvenRunnable evenRunnable = new OddEvenRunnable(0);

		Thread t1 = new Thread(oddRunnable, "odd");
		Thread t2 = new Thread(evenRunnable, "even");

		t1.start();
		t2.start();

	}

}

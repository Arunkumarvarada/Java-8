package com.java4u.multithreading.coding.wait_notify;

public class PrintEvenOddTester {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.isOdd = true;
		Thread t1 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				printer.printEven();
				
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				printer.printOdd();
				
			}
		});
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

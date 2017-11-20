package com.java4u.multithreading.util;

public class LoopTaskA implements Runnable {

	private static int count = 0;
	private int id;

	@Override
	public void run() {
		System.out.println("##### <TASK - " + id + "> STATRING ##### ");
		for (int i = 10; i > 0; i--) {
			System.out.println("< TASK" + id + "> TICK TICK : " + i);
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("##### <TASK - " + id + "> DONE ##### ");

	}

	public LoopTaskA() {
		this.id = ++count;

	}

}
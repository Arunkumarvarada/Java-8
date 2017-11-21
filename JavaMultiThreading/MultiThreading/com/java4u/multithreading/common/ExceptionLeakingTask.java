package com.java4u.multithreading.common;

public class ExceptionLeakingTask implements Runnable {

	@Override
	public void run() {
		throw new RuntimeException();

	}

}

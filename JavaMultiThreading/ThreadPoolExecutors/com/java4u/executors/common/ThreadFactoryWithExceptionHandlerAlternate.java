package com.java4u.executors.common;

public class ThreadFactoryWithExceptionHandlerAlternate extends NamedThreadFactory {
	private int count = 0;

	public Thread newThread(Runnable r) {
		Thread t = super.newThread(r);
		int sequnceNumber = ++count;
		if (sequnceNumber % 2 == 0) {
			t.setUncaughtExceptionHandler(new ThreadExceptionHandler());
		}
		return t;
	}

}

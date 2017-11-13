package com.java4u.concurrency.util;

public class ThreadUtil {
	
	public static void sleep(long millseconds) {
		try {
			Thread.sleep(millseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package com.java4u.threadpool.util;

public class ThreadUtil {
	
	public static void sleep(long millseconds) {
		try {
			Thread.sleep(millseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

package com.java4u.threads.util;

public class ThreadUtil {
	
	public static void sleep(long millseconds) {
		try {
			Thread.sleep(millseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

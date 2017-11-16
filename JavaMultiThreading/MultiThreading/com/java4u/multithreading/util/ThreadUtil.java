package com.java4u.multithreading.util;
public class ThreadUtil {

	public static void sleepThread(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
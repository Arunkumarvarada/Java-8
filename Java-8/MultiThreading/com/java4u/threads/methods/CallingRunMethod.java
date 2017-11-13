package com.java4u.threads.methods;

import com.java4u.concurrency.util.ThreadUtil;

public class CallingRunMethod extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			ThreadUtil.sleep(1000);
		}
	}

	public static void main(String[] args) {
		CallingRunMethod thread = new CallingRunMethod();
		thread.run();

	}

}

package com.java4u.threads;

import com.java4u.threads.util.ThreadUtil;

public class CreationUsingThreadClass extends Thread{
	
	public void run() {
		System.out.println("Start of Thread Execution");
		for(int i=0; i<10;i++) {
			System.out.println(i);
			ThreadUtil.sleep(1000);
		}
		System.out.println("End of Thread Execution");
	}
	
	public static void main(String[] args) {
		CreationUsingThreadClass thread = new CreationUsingThreadClass();
		thread.start();
	}

}

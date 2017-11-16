package com.java4u.multithreading.naming;

import com.java4u.concurrency.util.ThreadUtil;
import com.java4u.multithreading.util.LoopTaskC;

public class NamingThreadSecondWay {

	public static void main(String[] args) {
		
		String currentThreadname = Thread.currentThread().getName();

		System.out.println("[" + currentThreadname + " ] Mian Thread starts Here...");

		new Thread(new LoopTaskC(),"MyThread-1").start();
		Thread t1 = new Thread(new LoopTaskC());
		//t1.setName("MyThread-2");
		t1.start();
		ThreadUtil.sleepThread(800);
		t1.setName("MyThread-2");
		System.out.println("[" + currentThreadname + " ] Mian Thread ends Here...");

	}

}

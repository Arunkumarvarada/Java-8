package com.java4u.multithreading.naming;

import com.java4u.threadpool.util.LoopTaskB;

public class NamingThreadFirstWay {

	public static void main(String[] args) {
		
		String currentThreadname = Thread.currentThread().getName();

		System.out.println("[" + currentThreadname + " ] Mian Thread starts Here...");

		new Thread(new LoopTaskB()).start();
		Thread t1 = new Thread(new LoopTaskB());
		t1.start();
		System.out.println("[" + currentThreadname + " ] Mian Thread ends Here...");

	}

}

package com.java4u.threads.threadexecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {
		ExecutorService executor= Executors.newFixedThreadPool(5);
		for ( int i=0;i<10; i++) {
			Runnable worker= new WorkThread(" " +i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finished the execution of all threads!!");
	}

}

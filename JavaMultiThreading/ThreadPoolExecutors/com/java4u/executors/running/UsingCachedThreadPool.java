package com.java4u.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.LoopTaskA;

public class UsingCachedThreadPool {
	
	 public static void main(String[] args) {
		
		System.out.println("Main Thread Starts Here.....");

		ExecutorService execService = Executors.newCachedThreadPool();
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());

		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.shutdown();

		/*
		 * java.util.concurrent.RejectedExecutionException will be thrown , if we submit
		 * task after the shutdown 
		 * execService.execute(new LoopTaskA());
		 */

		System.out.println("Main Thread Ends Here.....");
	}
}

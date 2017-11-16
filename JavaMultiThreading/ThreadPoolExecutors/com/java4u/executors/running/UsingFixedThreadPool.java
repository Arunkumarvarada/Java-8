package com.java4u.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.threadpool.util.LoopTaskA;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread Starts Here.....");
		ExecutorService execService = Executors.newFixedThreadPool(6);
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());

		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.shutdown();
		
		/*
		 * java.util.concurrent.RejectedExecutionException will be thrown , 
		 * if we submit task  after the shutdown
		 * execService.execute(new LoopTaskA());
		 * */
		System.out.println("Main Thread Ends Here.....");

	}

}

package com.java4u.executors.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.threadpool.util.LoopTaskA;

public class UsingSingleThreadExecutor {

	public static void main(String[] args) {
		System.out.println("Main Thread Starts Here.....");

		ExecutorService execService = Executors.newSingleThreadExecutor();
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());
		execService.execute(new LoopTaskA());

		execService.shutdown();
		System.out.println("Main Thread Ends Here.....");

	}

}

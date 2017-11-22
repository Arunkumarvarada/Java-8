package com.java4u.executors.naming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.executors.common.LoopTaskC;
import com.java4u.executors.common.NamedThreadFactory;
import com.java4u.executors.util.ThreadUtil;

public class NamingCachedThreadPool {

	public static void main(String[] args) {

		System.out.println("Main Thread Starts Here.....");

		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadFactory());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());

		ThreadUtil.sleepThread(800);

		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());

		execService.shutdown();

		/*
		 * java.util.concurrent.RejectedExecutionException will be thrown , if we submit
		 * task after the shutdown execService.execute(new LoopTaskA());
		 */

		System.out.println("Main Thread Ends Here.....");
	}
}

package com.java4u.executors.naming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.java4u.multithreading.util.LoopTaskC;
import com.java4u.threadpool.util.NamedThreadFactory;

public class NamingExecutorThread {

	public static void main(String[] args) {
		String currentThreadname = Thread.currentThread().getName();

		System.out.println("[" + currentThreadname + " ] Mian Thread starts Here...");

		ExecutorService execService = Executors.newCachedThreadPool(new NamedThreadFactory());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());
		execService.execute(new LoopTaskC());

		execService.shutdown();

		System.out.println("[" + currentThreadname + " ] Mian Thread ends Here...");

	}

}

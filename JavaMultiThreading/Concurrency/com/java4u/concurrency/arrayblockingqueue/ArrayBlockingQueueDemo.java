package com.java4u.concurrency.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.java4u.concurrency.common.Consumer;
import com.java4u.concurrency.common.Producer;
import com.java4u.threadpool.util.ThreadUtil;

public class ArrayBlockingQueueDemo {

	public static void main(String[] args) {
		System.out.println("#### Main Thread Started... ####");
		BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		new Thread(producer).start();
		new Thread(consumer).start();
		ThreadUtil.sleepThread(4000);
		System.out.println("#### Main Thread ended... ####");
	}

}

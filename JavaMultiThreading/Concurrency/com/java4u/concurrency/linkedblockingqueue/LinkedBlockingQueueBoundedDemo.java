package com.java4u.concurrency.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.java4u.concurrency.common.Consumer;
import com.java4u.concurrency.common.Producer;
import com.java4u.concurrency.util.ThreadUtil;

public class LinkedBlockingQueueBoundedDemo {

	public static void main(String[] args) {
		System.out.println("#### Main Thread Started... ####");
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(1024);

		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);

		new Thread(producer).start();
		new Thread(consumer).start();
		ThreadUtil.sleepThread(4000);
		System.out.println("#### Main Thread ended... ####");
	}

}

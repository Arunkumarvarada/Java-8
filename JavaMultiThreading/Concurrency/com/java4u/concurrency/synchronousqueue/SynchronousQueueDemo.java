package com.java4u.concurrency.synchronousqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

import com.java4u.concurrency.common.SynchronousQueueConsumer;
import com.java4u.concurrency.common.SynchronousQueueProducer;

public class SynchronousQueueDemo {

	public static void main(String[] args) {
		
		BlockingQueue<String> sychronousQueue = new SynchronousQueue<String>();
		
		SynchronousQueueProducer synchronousQueueProducer = new SynchronousQueueProducer(sychronousQueue);
		new Thread(synchronousQueueProducer).start();
		
		SynchronousQueueConsumer synchronousQueueConsumer1 = new SynchronousQueueConsumer(sychronousQueue);
		new Thread(synchronousQueueConsumer1).start();
		
		SynchronousQueueConsumer synchronousQueueConsumer2 = new SynchronousQueueConsumer(sychronousQueue);
		new Thread(synchronousQueueConsumer2).start();

	}

}

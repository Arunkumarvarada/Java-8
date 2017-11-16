package com.java4u.concurrency.linkedtransferqueue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

import com.java4u.concurrency.common.LinkedTransferQueueConsumer;
import com.java4u.concurrency.common.LinkedTransferQueueProducer;

public class LinkedTransferQueueDemo {

	public static void main(String[] args) {
		TransferQueue<String> queue = new LinkedTransferQueue<String>();

		LinkedTransferQueueProducer linkedTransferQueueProducer = new LinkedTransferQueueProducer(queue);
		new Thread(linkedTransferQueueProducer).start();

		LinkedTransferQueueConsumer linkedTransferQueueConsumer1 = new LinkedTransferQueueConsumer(queue);
		new Thread(linkedTransferQueueConsumer1).start();

		LinkedTransferQueueConsumer linkedTransferQueueConsumer2 = new LinkedTransferQueueConsumer(queue);
		new Thread(linkedTransferQueueConsumer2).start();

	}

}

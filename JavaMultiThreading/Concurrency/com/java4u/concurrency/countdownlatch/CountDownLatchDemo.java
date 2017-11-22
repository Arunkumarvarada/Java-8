package com.java4u.concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

import com.java4u.concurrency.common.CountDownService;
import com.java4u.concurrency.util.ThreadUtil;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		CountDownLatch countDownLatch = new CountDownLatch(3);

		Thread cacheService = new Thread(new CountDownService(4000, "CacheService", countDownLatch));
		Thread validationService = new Thread(new CountDownService(4000, "ValidationService", countDownLatch));
		Thread alertService = new Thread(new CountDownService(4000, "AlertService", countDownLatch));

		cacheService.start();
		ThreadUtil.sleepThread(4000);
		
		validationService.start();
		ThreadUtil.sleepThread(4000);
		
		alertService.start();
		ThreadUtil.sleepThread(4000);

		try {
			countDownLatch.await();
			System.out.println("All Services are up, Application is setting up now!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

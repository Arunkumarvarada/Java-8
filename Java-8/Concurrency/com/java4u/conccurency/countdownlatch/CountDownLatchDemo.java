package com.java4u.conccurency.countdownlatch;

import java.util.concurrent.CountDownLatch;

import com.java4u.threads.util.ThreadUtil;

public class CountDownLatchDemo {
	public static void main(String[] args) {
		final CountDownLatch latch = new CountDownLatch(3);
		Thread cacheService = new Thread(new Service(4000, "CacheService", latch));
		Thread alertService = new Thread(new Service(4000, "AlertService", latch));
		Thread validationService = new Thread(new Service(4000, "ValidationService", latch));
		cacheService.start();
		ThreadUtil.sleep(4000);
		alertService.start();
		ThreadUtil.sleep(4000);
		validationService.start();
		ThreadUtil.sleep(4000);

		try {
			latch.await();
			System.out.println("All the Services are up, Application is Starting!!!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

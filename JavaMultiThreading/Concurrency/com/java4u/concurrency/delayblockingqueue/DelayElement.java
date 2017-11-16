package com.java4u.concurrency.delayblockingqueue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayElement implements Delayed {
	private String element;
	private long expireTime;

	public DelayElement(String element, long expireTime) {
		this.element = element;
		this.expireTime = expireTime;
	}

	@Override
	public int compareTo(Delayed obj) {
		if (this.expireTime < ((DelayElement) obj).expireTime) {
			return -1;
		} else if (this.expireTime > ((DelayElement) obj).expireTime) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long diff = expireTime - System.currentTimeMillis();
		return unit.convert(diff, TimeUnit.MILLISECONDS);
	}

	@Override
	public String toString() {
		return element + ": " + expireTime;
	}
}

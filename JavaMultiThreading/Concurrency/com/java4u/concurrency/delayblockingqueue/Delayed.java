package com.java4u.concurrency.delayblockingqueue;

import java.util.concurrent.TimeUnit;

public interface Delayed extends Comparable {
	long getDelay(TimeUnit unit);
}

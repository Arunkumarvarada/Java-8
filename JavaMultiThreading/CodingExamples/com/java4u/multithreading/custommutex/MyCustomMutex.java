package com.java4u.multithreading.custommutex;

public class MyCustomMutex {

	private boolean inUse = false;

	public void aquire() throws InterruptedException {
		if (Thread.interrupted())
			throw new InterruptedException();
		synchronized (this) {
			try {
				while (inUse)
					wait();
			} catch (InterruptedException e) {
				notify();
				throw e;
			}
		}
	}

	public synchronized void relase() {
		inUse = false;
		notify();
	}
}

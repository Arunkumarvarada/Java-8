package com.java4u.dp.observer.interfaces;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();

	public MyTopic() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		if (observer == null) {
			throw new NullPointerException();
		}
		synchronized (MUTEX) {
			if (!observers.contains(observer)) {
				observers.add(observer);
			}
		}
	}

	@Override
	public void unregister(Observer observer) {
		synchronized (MUTEX) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyAllObservers() {
		List<Observer> observerLocal = null;
		synchronized (MUTEX) {
			if (!changed) {
				return;
			}
			observerLocal = new ArrayList<>(this.observers);
			this.changed = false;
		}
		for (Observer observer : observerLocal) {
			observer.update();
		}
	}

	@Override
	public Object getUpdate() {
		return this.message;
	}

	public void postMessage(String msg) {
		System.out.println("Message Posted to topic : " + msg);
		this.message = msg;
		this.changed = true;
		notifyAllObservers();
	}

}

package com.java4u.dp.observer.interfaces;

public interface Subject {

	public void register(Observer observer);

	public void unregister(Observer observer);

	public void notifyAllObservers();

	public Object getUpdate();

}

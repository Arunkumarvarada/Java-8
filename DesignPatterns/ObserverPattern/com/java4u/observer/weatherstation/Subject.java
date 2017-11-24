package com.java4u.observer.weatherstation;

public interface Subject {

	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyAllObservers();
	
}

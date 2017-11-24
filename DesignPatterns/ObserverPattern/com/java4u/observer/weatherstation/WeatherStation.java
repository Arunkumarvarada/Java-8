package com.java4u.observer.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private int temperature;
	private int humidity;
	private int pressure;
	List<Observer> observers = null;

	public WeatherStation() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);

	}

	@Override
	public void notifyAllObservers() {
		for(Observer observer: observers) {
			observer.update(pressure, temperature, humidity);
		}
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyAllObservers();
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifyAllObservers();
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyAllObservers();
	}

}

package com.java4u.observer.weatherstation;

public class WeatherObserver implements Observer {

	private int pressure;
	private int temparature;
	private int humidity;
	private Subject subject;

	public WeatherObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(int pressure, int temperature, int humidity) {
		this.pressure = pressure;
		this.temparature = temperature;
		this.humidity = humidity;

		showData();
	}

	private void showData() {
		System.out.println(
				"Pressure : " + this.pressure + " Temparature : " + this.temparature + " Humidity : " + this.humidity);

	}

}

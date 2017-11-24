package com.java4u.dp.observer.test;

import com.java4u.observer.weatherstation.WeatherObserver;
import com.java4u.observer.weatherstation.WeatherStation;

public class WeatherStationDemo {

	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		WeatherObserver observer = new WeatherObserver(station);

		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperature(45);

		observer.update(100, 23, 33);

	}

}

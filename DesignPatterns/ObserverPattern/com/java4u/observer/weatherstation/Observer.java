package com.java4u.observer.weatherstation;

public interface Observer {
	
	public void update(int pressure, int temperature, int humidity);

}

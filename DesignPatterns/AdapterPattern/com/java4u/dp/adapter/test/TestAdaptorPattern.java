package com.java4u.dp.adapter.test;

import com.java4u.dp.adapter.Bicycle;
import com.java4u.dp.adapter.BicycleAdapter;
import com.java4u.dp.adapter.Bus;
import com.java4u.dp.adapter.Car;
import com.java4u.dp.adapter.Vehicle;

public class TestAdaptorPattern {

	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bus = new Bus();
		Vehicle bicycle = new BicycleAdapter(new Bicycle());

		bus.accelerate();
		car.accelerate();
		bicycle.accelerate();

	}

}

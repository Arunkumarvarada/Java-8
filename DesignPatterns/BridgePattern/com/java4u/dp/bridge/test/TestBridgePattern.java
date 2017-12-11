package com.java4u.dp.bridge.test;

import com.java4u.dp.bridge.Circle;
import com.java4u.dp.bridge.GreenCircle;
import com.java4u.dp.bridge.RedCircle;
import com.java4u.dp.bridge.Shape;

public class TestBridgePattern {

	public static void main(String[] args) {
		Shape redCirlce = new Circle(100, 100, 10, new RedCircle());
		Shape greenCirlce = new Circle(100, 100, 10, new GreenCircle());

		redCirlce.draw();
		greenCirlce.draw();

	}

}

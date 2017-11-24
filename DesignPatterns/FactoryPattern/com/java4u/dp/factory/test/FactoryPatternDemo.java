package com.java4u.dp.factory.test;

import com.java4u.dp.factory.impl.ShapeFactory;
import com.java4u.dp.factory.interfaces.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		Shape traingle = factory.getShape("Traingle");
		Shape rectangle = factory.getShape("Rectangle");
		Shape circle = factory.getShape("circle");

		traingle.draw();
		rectangle.draw();
		circle.draw();

	}

}

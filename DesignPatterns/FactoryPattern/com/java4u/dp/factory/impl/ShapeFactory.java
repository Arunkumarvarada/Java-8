package com.java4u.dp.factory.impl;

import com.java4u.dp.factory.interfaces.Shape;

public class ShapeFactory {

	private Shape shape = null;

	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("TRAINGLE")) {
			shape = new Traingle();
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			shape = new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			shape = new Circle();
		}
		return shape;
	}

}

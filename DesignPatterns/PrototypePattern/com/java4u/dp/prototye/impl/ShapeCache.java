package com.java4u.dp.prototye.impl;

import java.util.Hashtable;

import com.java4u.dp.prototye.interfaces.Shape;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	public static void loadCache() {
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		shapeMap.put(rectangle.getId(), rectangle);

		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);

		Traingle traingle = new Traingle();
		traingle.setId("3");
		shapeMap.put(traingle.getId(), traingle);

	}

}

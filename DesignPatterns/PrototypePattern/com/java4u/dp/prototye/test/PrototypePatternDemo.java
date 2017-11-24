package com.java4u.dp.prototye.test;

import com.java4u.dp.prototye.impl.ShapeCache;
import com.java4u.dp.prototye.interfaces.Shape;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();

		try {
			Shape shapeClone = (Shape) ShapeCache.getShape("1");
			System.out.println("Shape : " + shapeClone.getType());

			Shape shapeClone2 = (Shape) ShapeCache.getShape("2");
			System.out.println("Shape : " + shapeClone2.getType());

			Shape shapeClone3 = (Shape) ShapeCache.getShape("3");
			System.out.println("Shape : " + shapeClone3.getType());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

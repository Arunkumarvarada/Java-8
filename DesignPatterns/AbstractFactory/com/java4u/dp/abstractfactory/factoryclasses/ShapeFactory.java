package com.java4u.dp.abstractfactory.factoryclasses;

import com.java4u.dp.abstractfactory.interfaces.Color;
import com.java4u.dp.abstractfactory.interfaces.Shape;
import com.java4u.dp.abstractfactory.impl.Circle;
import com.java4u.dp.abstractfactory.impl.Rectangle;
import com.java4u.dp.abstractfactory.impl.Traingle;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("TRAINGLE")) {
			return new Traingle();
		}
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		return null;
	}

}

package com.java4u.dp.abstractfactory.factoryclasses;

import com.java4u.dp.abstractfactory.impl.Blue;
import com.java4u.dp.abstractfactory.impl.Green;
import com.java4u.dp.abstractfactory.impl.Red;
import com.java4u.dp.abstractfactory.interfaces.Color;
import com.java4u.dp.abstractfactory.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		if (colorType.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		if (colorType.equalsIgnoreCase("RED")) {
			return new Red();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

}

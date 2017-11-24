package com.java4u.dp.abstractfactory.factoryclasses;

import com.java4u.dp.abstractfactory.interfaces.Color;
import com.java4u.dp.abstractfactory.interfaces.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String colorType);

	public abstract Shape getShape(String shapeType);

}

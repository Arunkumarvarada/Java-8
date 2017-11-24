package com.java4u.dp.abstractfactory.test;

import com.java4u.dp.abstractfactory.factoryclasses.AbstractFactory;
import com.java4u.dp.abstractfactory.factoryclasses.FactoryProducer;
import com.java4u.dp.abstractfactory.interfaces.Color;
import com.java4u.dp.abstractfactory.interfaces.Shape;

public class AbstractFactroyPatternDemo {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		Shape shape2 = shapeFactory.getShape("TRAINGLE");
		Shape shape3 = shapeFactory.getShape("RECTANGLE");

		shape1.draw();
		shape2.draw();
		shape3.draw();

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		Color color1 = colorFactory.getColor("GREEN");
		Color color2 = colorFactory.getColor("BLUE");
		Color color3 = colorFactory.getColor("RED");

		color1.fill();
		color2.fill();
		color3.fill();

	}

}

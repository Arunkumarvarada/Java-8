package com.java4u.dp.abstractfactory.impl;

import com.java4u.dp.abstractfactory.interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle Impl");
	}

}

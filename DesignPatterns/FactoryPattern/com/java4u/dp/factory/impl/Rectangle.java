package com.java4u.dp.factory.impl;

import com.java4u.dp.factory.interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle Impl");
	}

}

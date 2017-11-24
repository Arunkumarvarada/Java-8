package com.java4u.dp.prototye.impl;

import com.java4u.dp.prototye.interfaces.Shape;

public class Rectangle extends Shape {
	public Rectangle() {
		type="Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Inside the Rectangle Implementation!!! ");
	}

}

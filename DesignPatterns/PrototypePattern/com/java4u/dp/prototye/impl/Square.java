package com.java4u.dp.prototye.impl;

import com.java4u.dp.prototye.interfaces.Shape;

public class Square extends Shape {
	public Square() {
		type="Square";
	}

	@Override
	public void draw() {
		System.out.println("Inside the Square Implementation!!! ");
	}

}

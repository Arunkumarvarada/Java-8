package com.java4u.dp.prototye.impl;

import com.java4u.dp.prototye.interfaces.Shape;

public class Traingle extends Shape {
	public Traingle() {
		type="Traingle";
	}

	@Override
	public void draw() {
		System.out.println("Inside the Traingle Implementation!!! ");
	}

}

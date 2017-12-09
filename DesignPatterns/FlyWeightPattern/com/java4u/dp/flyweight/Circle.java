package com.java4u.dp.flyweight;

public class Circle implements Shape {

	private int x;
	private int y;
	private int radius;
	private String color;

	@Override
	public void draw() {
		System.out.println("Cirle Draw():: [Color: " + color + ", x : " + x + ", y :" + y + ", radius : " + radius);

	}

	public Circle(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

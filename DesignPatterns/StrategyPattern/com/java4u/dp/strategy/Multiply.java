package com.java4u.dp.strategy;

public class Multiply implements Strategy {

	@Override
	public void operation(int num1, int num2) {
		System.out.println("Product of two numbers :: "+num1 * num2);
	}

}

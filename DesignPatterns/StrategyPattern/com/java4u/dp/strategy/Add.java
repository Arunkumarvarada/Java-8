package com.java4u.dp.strategy;

public class Add implements Strategy {

	@Override
	public void operation(int num1, int num2) {
		System.out.println("Sum of two numbers :: "+num1 + num2);

	}

}

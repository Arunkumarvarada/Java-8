package com.java4u.dp.decorator.test;

import com.java4u.dp.decorator.Beverage;
import com.java4u.dp.decorator.Milk;
import com.java4u.dp.decorator.PlainBeverage;
import com.java4u.dp.decorator.Sugar;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		Beverage beverage = new Sugar(new Milk(new PlainBeverage()));
		System.out.println(beverage.getCost());
		System.out.println(beverage.getDescription());

	}

}

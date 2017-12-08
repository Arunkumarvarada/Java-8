package com.java4u.dp.decorator;

public class Milk extends BeverageDecorator {
	private Beverage beverage;

	public Milk(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	public int getCost() {
		return this.beverage.getCost() + 3;
	}

	public String getDescription() {
		return this.beverage.getDescription() + " milk ";
	}

}

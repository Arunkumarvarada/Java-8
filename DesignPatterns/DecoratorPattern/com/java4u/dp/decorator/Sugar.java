package com.java4u.dp.decorator;

public class Sugar extends BeverageDecorator {
	private Beverage beverage;

	public Sugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	public int getCost() {
		return this.beverage.getCost() + 6;
	}

	public String getDescriiption() {
		return this.beverage.getDescription() + " Sugar ";
	}

}

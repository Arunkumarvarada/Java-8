package com.java4u.dp.visitor;

public class ShoppingCart implements ShoppingCartVisitor {

	@Override
	public double visitor(Table table) {
		return table.getPrice();
	}

	@Override
	public double visitor(Chair chair) {
		return chair.getPrice();
	}

}

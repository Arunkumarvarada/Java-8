package com.java4u.dp.visitor;

public interface ShoppingCartVisitor {
	
	public double visitor(Table table);

	public double visitor(Chair chair);
}

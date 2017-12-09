package com.java4u.dp.visitor;

public class Table implements ShoppingItem {
	
	private double price;
	private String name;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Table(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	@Override
	public double accept(ShoppingCartVisitor visitor) {
		return visitor.visitor(this);
	}

}

package com.java4u.dp.visitor.test;

import java.util.ArrayList;
import java.util.List;

import com.java4u.dp.visitor.Chair;
import com.java4u.dp.visitor.ShoppingCart;
import com.java4u.dp.visitor.ShoppingCartVisitor;
import com.java4u.dp.visitor.ShoppingItem;
import com.java4u.dp.visitor.Table;

public class TestVisitorPattern {

	public static void main(String[] args) {
		List<ShoppingItem> items = new ArrayList<>();
		items.add(new Table(22, "table"));
		items.add(new Table(3, "table"));
		items.add(new Table(2, "table"));
		items.add(new Chair("chair", 45));

		double sum = 0;
		ShoppingCartVisitor shoppingCart = new ShoppingCart();

		for (ShoppingItem shoppingItem : items)
			sum = sum + shoppingItem.accept(shoppingCart);

		System.out.println(sum);
	}

}

package com.java4u.dp.strategy.test;

import com.java4u.dp.strategy.Add;
import com.java4u.dp.strategy.Manager;
import com.java4u.dp.strategy.Multiply;

public class TestStrategyPattern {

	public static void main(String[] args) {
		Manager manager = new Manager();
		
		manager.setStrategy(new Add());
		manager.operation(1, 5);
		
		manager.setStrategy(new Multiply());
		manager.operation(2, 5);

	}

}

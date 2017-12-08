package com.java4u.dp.nullobjpattern.test;

import com.java4u.dp.nullobjpattern.CustomerFactory;

public class TestNullObjectPattern {

	public static void main(String[] args) {
		CustomerFactory customerFactory = new CustomerFactory();
		System.out.println(customerFactory.getCustomer("Arun").getCustomer());
		System.out.println(customerFactory.getCustomer("Joe").getCustomer());
		System.out.println(customerFactory.getCustomer("Joel").getCustomer());
		System.out.println(customerFactory.getCustomer("Daniela").getCustomer());
		System.out.println(customerFactory.getCustomer("Varun").getCustomer());

	}

}

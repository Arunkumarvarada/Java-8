package com.java4u.dp.nullobjpattern;

public class CustomerFactory {

	private Database database;

	public CustomerFactory() {
		this.database = new Database();
	}

	public AbstractCustomer getCustomer(String name) {
		if (checkName(name)) {
			return new RealCustomer(name);
		}
		return new NullCustomer();
	}

	private boolean checkName(String name) {
		if (database.isCustomerexists(name)) {
			return true;
		}
		return false;
	}

}

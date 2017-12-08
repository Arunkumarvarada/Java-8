package com.java4u.dp.nullobjpattern;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<String> customerNames;

	public Database() {
		this.customerNames = new ArrayList<>();
		this.customerNames.add("Arun");
		this.customerNames.add("Samuel");
		this.customerNames.add("Srinivas");
		this.customerNames.add("Divakar");
		this.customerNames.add("Sruthi");
		this.customerNames.add("Varun");
	}

	public boolean isCustomerexists(String name) {
		for (String s : customerNames) {
			if (s.equals(name)) {
				return true;
			}
		}
		return false;
	}
}

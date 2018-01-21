package com.java4u.ds.arraylist;

class Employee {
	private String id;
	private String name;

	public Employee(String id, String name) { // constructor
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee[id=" + id + ", name=" + name + "] ";
	}

}
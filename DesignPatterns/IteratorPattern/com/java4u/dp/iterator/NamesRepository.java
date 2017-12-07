package com.java4u.dp.iterator;

public class NamesRepository {

	private String names[] = { "Arun", "Shyam", "John", "Varsha", "Sunil" };

	public Iterator getIterator() {
		return new NameIterator(names);
	}
}

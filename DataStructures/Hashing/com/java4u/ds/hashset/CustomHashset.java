package com.java4u.ds.hashset;

import java.util.HashMap;
import java.util.Map.Entry;

public class CustomHashset<E> {

	private HashMap<E, Object> map;

	public CustomHashset() {
		map = new HashMap<E, Object>();
	}

	public void add(E e) {
		map.put(e, null);
	}

	public boolean contains(E e) {
		return map.containsKey(e) ? true : false;
	}

	public void remove(E obj) {
		map.remove(obj);
	}

	public void display() {
		
		for (E e : map.keySet()) {
			System.out.println(e.toString());
		}

	}
}

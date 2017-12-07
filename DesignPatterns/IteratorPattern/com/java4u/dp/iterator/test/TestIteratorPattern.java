package com.java4u.dp.iterator.test;

import com.java4u.dp.iterator.Iterator;
import com.java4u.dp.iterator.NamesRepository;

public class TestIteratorPattern {

	public static void main(String[] args) {
		NamesRepository namesRepository = new NamesRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println(name);
		}

	}

}

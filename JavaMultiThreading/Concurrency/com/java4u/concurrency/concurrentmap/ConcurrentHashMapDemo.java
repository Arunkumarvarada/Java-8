package com.java4u.concurrency.concurrentmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Character, String> map = new ConcurrentHashMap<>();
		map.put('A', "Austin");
		map.put('B', "Bangalore");
		map.put('C', "Chennai");
		map.put('D', "Dehli");
		map.put('E', "Edinburgh");
		map.put('F', "FinLand");
		map.put('H', "Hobart");

		for (Map.Entry<Character, String> e : map.entrySet()) {
			System.out.println(e.getKey()+ " : "+ e.getValue());
		}

	}

}

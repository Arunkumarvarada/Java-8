package com.java4u.ds.hashmap;

public class CustomHashMapDemo {

	public static void main(String[] args) {
		CustomHashMap<Integer, Integer> hashMapCustom = new CustomHashMap<Integer, Integer>();
		hashMapCustom.put(21, 23);
		hashMapCustom.put(23, 34);
		hashMapCustom.put(24, 44);
		hashMapCustom.put(43, 46);
		hashMapCustom.put(51, 45);

		System.out.println("value corresponding to key 21=" + hashMapCustom.get(21));
		System.out.println("value corresponding to key 51=" + hashMapCustom.get(51));

		System.out.println("Displaying : ");
		hashMapCustom.display();

		System.out.println("\n\nvalue corresponding to key 21 removed: " + hashMapCustom.remove(21));
		System.out.println("value corresponding to key 51 removed: " + hashMapCustom.remove(51));

		System.out.println("Displaying : ");
		hashMapCustom.display();

	}

}

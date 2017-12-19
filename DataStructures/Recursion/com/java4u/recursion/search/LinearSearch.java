package com.java4u.recursion.search;

public class LinearSearch {

	public static boolean linearSearch(int item, int[] arr) {
		for (int i : arr) {
			if (item == i) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 8, 13, 22, 26, 40, 50, 57, 60 };
		System.out.println(linearSearch(5, array));
	}

}

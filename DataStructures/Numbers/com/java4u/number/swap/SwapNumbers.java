package com.java4u.number.swap;

public class SwapNumbers {

	public static void main(String[] args) {
		swap(4, 5);
	}

	private static void swap(int i, int j) {
		System.out.println("Before swapping the elements:: " + i + ", " + j);
		int temp = i;
		i = j;
		j = temp;
		System.out.println("After swapping the elements:: " + i + ", " + j);
	}

}

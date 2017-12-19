package com.java4u.number.swap;

public class SwapWithoutTempVariable {
	public static void main(String[] args) {
		swap(3, 5);
	}

	private static void swap(int i, int j) {
		System.out.println("Before swapping the elements:: " + i + ", " + j);
		i = i + j;
		j = i - j;
		i = i - j;

		System.out.println("After swapping the elements:: " + i + ", " + j);

	}

}

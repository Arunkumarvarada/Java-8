package com.java4u.number.reverse;

public class ReverseNumber {

	public static void main(String[] args) {
		reverseNumber(1234);

	}

	private static void reverseNumber(int i) {
		int rev = 0;
		System.out.println("Before reversing number:: " + i);
		if (i == 0) {
			rev = 0;
		}
		while (i != 0) {
			int remainder = i % 10;
			rev = rev * 10 + remainder;
			i = i / 10;

		}
		System.out.println("After reversing number:: " + rev);
	}

}

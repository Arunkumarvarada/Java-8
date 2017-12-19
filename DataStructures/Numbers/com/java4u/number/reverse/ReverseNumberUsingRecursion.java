package com.java4u.number.reverse;

public class ReverseNumberUsingRecursion {
	public static void main(String[] args) {
		System.out.println("Before reversing number:: " + 12345);
		System.out.println("Before reversing number:: " + recursiveReverseNumber(12345, 0));
	}

	private static int recursiveReverseNumber(int num, int rev) {
		if (num == 0) {
			return rev;
		}
		return recursiveReverseNumber(num / 10, num % 10 + rev * 10);
	}
}

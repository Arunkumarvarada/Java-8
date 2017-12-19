package com.java4u.number.palindrome;

public class NumberPalindrome {

	public static void main(String[] args) {
		System.out.println("Is Number Palindrome:: " + isPalindrome(1234));
		System.out.println("Is Number Palindrome:: " + isPalindrome(2222));

	}

	private static boolean isPalindrome(int number) {
		int revNumber = reverseNumber(number, 0);
		return (number == revNumber) ? true : false;
	}

	private static int reverseNumber(int num, int rev) {
		if (num == 0) {
			return rev;
		}
		return reverseNumber(num / 10, (num % 10 + rev * 10));
	}

}

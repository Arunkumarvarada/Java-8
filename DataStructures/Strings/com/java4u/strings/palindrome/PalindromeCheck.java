package com.java4u.strings.palindrome;

public class PalindromeCheck {
	public static boolean isPalindrome(String str) {
		if (str == null || str.length() == 0) {
			return false;
		}
		char charArray[] = str.toCharArray();
		int charLengthhalved = charArray.length / 2;
		for (int i = 0; i < charLengthhalved; i++) {
			if (charArray[i] != charArray[charArray.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Is Palindrome :: " + isPalindrome("MALAYALAM"));
		System.out.println("Is Palindrome :: " + isPalindrome("NITIN"));
		System.out.println("Is Palindrome :: " + isPalindrome("TEST"));

	}

}

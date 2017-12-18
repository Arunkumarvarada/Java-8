package com.java4u.strings.isRearragedToPalindrome;

public class IsRearrangedToFromPlaindrome {

	public static boolean canMakeAPalindrome(String str) {
		int[] frequencyArray = createFrequencyArray(str);
		int oddCharacterCount = 0;
		for (int ch : frequencyArray) {
			if (ch % 2 != 0) {
				oddCharacterCount++;
			}
			if (oddCharacterCount > 1) {
				return false;
			}
		}
		return true;
	}

	private static int[] createFrequencyArray(String str) {
		int[] frequencyArray = new int[256];
		char[] charArray = str.toCharArray();
		for (char ch : charArray) {
			frequencyArray[ch]++;
		}
		return frequencyArray;
	}

	public static void main(String[] args) {
		System.out.println("Can palindrome be formed from 'ktkat' ? : " + canMakeAPalindrome("ktkat"));
		System.out.println("Can palindrome be formed from 'mmo' ? : " + canMakeAPalindrome("mmo"));
		System.out.println("Can palindrome be formed from 'dreamer' ? : " + canMakeAPalindrome("dreamer"));
	}

}

package com.java4u.strings.anagram;

import java.util.Arrays;

public class CheckAnagram {

	public static boolean isAnagram(String str1, String str2) {
		boolean isAnagram = false;
		if (str1 == null || str2 == null || str1.length() != str2.length()) {
			return false;
		}
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		for (int i = 0; i < str1.length(); i++) {
			if (charArray1[i] == charArray2[i]) {
				isAnagram = true;
			} else {
				isAnagram = false;
				break;
			}
		}
		return isAnagram;
	}

	public static void main(String[] args) {

		System.out.println("Is Anangram:: " + isAnagram("abb", "bba"));
		System.out.println("Is Anangram:: " + isAnagram("abb", "bbaaa"));
		System.out.println("Is Anangram:: " + isAnagram("abb", null));
		System.out.println("Is Anangram:: " + isAnagram("abb", "bbb"));
		System.out.println("Is Anangram:: " + isAnagram("xyz", "aaa"));
		System.out.println("Is Anangram:: " + isAnagram("111", "111"));
		System.out.println("Is Anangram:: " + isAnagram("112", "121"));

	}

}

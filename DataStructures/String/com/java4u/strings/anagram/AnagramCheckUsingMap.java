package com.java4u.strings.anagram;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheckUsingMap {

	public static boolean isAnagram(String str1, String str2) {
		if (str1 == null || str2 == null) {
			return false;
		} else if (str1.length() != str2.length()) {
			return false;
		}

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str1.length(); i++) {
			char characters = str1.charAt(i);
			int charInStr1 = map.containsKey(characters) ? map.get(characters) : 0;
			map.put(characters, ++charInStr1);
			char charFromStr2 = str2.charAt(i);
			int charsInRight = map.containsKey(charFromStr2) ? map.get(charFromStr2) : 0;
			map.put(charFromStr2, --charsInRight);
		}

		for (int occurrences : map.values()) {
			if (occurrences != 0) {
				return false;
			}
		}
		return true;

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

package com.java4u.strings.findMissingNumber;

import java.util.Arrays;

public class FindMissingCharacter {

	public static void findMissingCharacter(String str) {
		if (str == null || str.length() == 0 || str.equals("")) {
			return;
		}
		str = str.toUpperCase();
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);

		printRange(charArray);
		System.out.println("Missing Character are...");
		for (int i = 0; i < charArray.length - 1; i++) {
			int charDiff = charArray[i + 1] - charArray[i];
			if (charDiff > 1) {
				for (int j = 1; j < charDiff; j++) {
					char c = (char) (charArray[i] + j);
					System.out.println(c + " ");
				}
			}

		}
	}

	private static void printRange(char[] charArray) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Range is from :: ").append(charArray[0]).append(" to ")
				.append(charArray[charArray.length - 1]);
		System.out.println(stringBuilder.toString());
	}

	public static void main(String[] args) {
		String str = "AHfB";

		System.out.println("String : " + str);

		findMissingCharacter(str);

	}

}

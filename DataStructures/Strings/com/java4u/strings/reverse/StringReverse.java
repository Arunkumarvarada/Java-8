package com.java4u.strings.reverse;

public class StringReverse {

	public static String reverse(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		StringBuilder stringBuilder = new StringBuilder();
		char charArray[] = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			stringBuilder.append(charArray[i]);
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		System.out.println("Reverse String of ARUN is: " + reverse("ARUN"));
		System.out.println("Reverse String of MALAYALAM is: " + reverse("MALAYALAM"));
	}

}

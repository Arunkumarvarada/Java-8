package com.java4u.strings.reverse;

public class ReverseUsingArraySwapping {
	public static String reverse(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		StringBuilder stringBuilder = new StringBuilder();
		char charArray[] = str.toCharArray();
		int i, j;
		i = 0;
		j = charArray.length - 1;
		while (i < j) {
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;
		}
		for (char c : charArray) {
			stringBuilder.append(c);
		}
		return stringBuilder.toString();

	}

	public static void main(String[] args) {
		System.out.println("Reverse String of ARUN is: " + reverse("ARUN"));
		System.out.println("Reverse String of MALAYALAM is: " + reverse("MALAYALAM"));
	}

}

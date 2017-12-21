package com.java4u.strings.interviewbit.palindrome;

public class Solution {

	public int isPalindrome(String a) {
		a = a.replaceAll("\\s", "");
		a = a.replaceAll("[\":,]", "");
		a = a.toLowerCase();
		System.out.println(a);

		String reverse = "";

		int length = a.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + a.charAt(i);

		if (a.equals(reverse))
			return 1;
		else
			return 0;

	}

	public static void main(String[] args) {
		System.out.println(new Solution().isPalindrome("\"A man, a plan, a canal: Panama\"\""));
		System.out.println(new Solution().isPalindrome("\"A man, a plan, a canal: Panama\""));
	}
}
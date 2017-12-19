package com.java4u.recursion.sum;

public class SumOfNumbers {

	public static int sumIterative(int n) {
		int result = 0;
		for (int i = 1; i <=n; i++) {
			result = result + i;
		}
		return result;
	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(sumIterative(4));
		System.out.println(sum(4));
	}

}

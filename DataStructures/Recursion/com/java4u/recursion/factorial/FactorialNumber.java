package com.java4u.recursion.factorial;

public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("Nth Factorail number : " + factorial(7));
	}

	private static int factorial(int N) {
		if (N == 0) {
			return 1;
		}
		return N * factorial(N - 1);
	}
}

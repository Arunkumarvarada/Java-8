package com.java4u.recursion.fibonacci;

public class FibonacciNumber {

	public static void main(String[] args) {
		System.out.println("Nth Fibonacci number : " + fib(10));

	}

	private static int fib(int N) {
		if (N == 1) {
			return 0;
		}
		if (N == 2) {
			return 1;
		}
		return fib(N - 1) + fib(N - 2);
	}
}

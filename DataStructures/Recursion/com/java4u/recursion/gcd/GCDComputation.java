package com.java4u.recursion.gcd;

public class GCDComputation {

	public static int gcdIterative(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

	public static int recusiveGCD(int num1, int num2) {
		if (num2 == 0)
			return num1;
		return recusiveGCD(num2, num1 % num2);
	}

	public static void main(String[] args) {
		System.out.println(gcdIterative(12, 3));
		System.out.println(recusiveGCD(12, 5));
	}

}

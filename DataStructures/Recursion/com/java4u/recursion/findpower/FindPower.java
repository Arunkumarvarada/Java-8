package com.java4u.recursion.findpower;

public class FindPower {

	public static int findPower(int x, int y) {
		if (y == 0) {
			return 1;
		}
		return x * findPower(x, y - 1);
	}

	public static void main(String[] args) {

		System.out.println("Power: " + findPower(2, 4));
	}

}

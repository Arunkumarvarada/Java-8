package com.java4u.ds.circlularlinkedlist.josephusCircle;

public class JosephusCircle {

	/*
	 * Recursive Structure for Josrphus problem
	 * josephus(n, k) = (josephus(n - 1, k) + k-1) % n + 1 
	 * josephus(1, k) = 1
	 */
	public static int josephus(int n, int k) {
		if (n == 1) {
			return 1;
		}
		return (josephus(n - 1, k) + k - 1) % n + 1;
	}

	public static void main(String[] args) {
		int n = 14;
		int k = 2;
		System.out.println("The chosen place is " + josephus(n, k));
	}

}

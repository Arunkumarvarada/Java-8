package com.java4u.intelinterview;
import java.util.HashMap;
import java.util.Map;

public class Test {

	static int numberOfPairs(int[] a, long k) {
		int count = 0;
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			if (pairs.containsKey(a[i])) {
				
				count++;
			} else
				pairs.put((int) (k - a[i]), a[i]);
		}
		return count;
	}

	public static void main(String[] args) {

		int[] a = { 2, 45, 7, 3, 5, 1, 8, 9 };
		System.out.println(numberOfPairs(a, 10));

	}
}

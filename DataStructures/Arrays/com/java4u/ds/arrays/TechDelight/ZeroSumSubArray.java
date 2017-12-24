package com.java4u.ds.arrays.TechDelight;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {

	public static boolean isZeroSubSumArrayEists(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(0);
		int sum = 0;
		for (int i = 0; i < A.length - 1; i++) {
			sum += A[i];
			if (set.contains(sum)) {
				return true;
			}
			set.add(sum);
		}
		return false;
	}

	public static void main(String[] args) {
		int A[] = { 4, -6, 3, -1, 4, 2, 7 };
		System.out.println(isZeroSubSumArrayEists(A));

	}

}

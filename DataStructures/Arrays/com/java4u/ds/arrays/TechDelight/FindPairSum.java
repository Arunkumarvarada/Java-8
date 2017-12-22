package com.java4u.ds.arrays.TechDelight;

import java.util.Arrays;
import java.util.HashMap;

public class FindPairSum {

	public void pairSum(int a[], int n, int sum) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i] + a[j] == sum) {
					System.out.println("pair found at index " + a[i] + " and " + a[j]);
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Pair Not Found!!");
		} else {
			System.out.println(count);
		}
	}

	public void pairSumWithSorting(int a[], int n, int sum) {
		Arrays.sort(a);
		int count = 0;
		int low = 0;
		int high = n;
		while (low < high) {
			if (a[low] + a[high] == sum) {
				System.out.println("Pair found " + a[low] + " and " + a[high]);
				count++;
			}
			low++;
			high--;
		}
		if (count == 0) {
			System.out.println("Pair Not Found!!");
		} else {
			System.out.println(count);
		}
	}

	public void pairSumWithHashing(int a[], int n, int sum) {
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i <= n; i++) {
			if (map.containsKey(sum - a[i])) {
				count++;
				System.out.println("Pair found " + a[i] + " and " + (sum - a[i]));
			}
			map.put(a[i], i);
		}
		if (count == 0) {
			System.out.println("Pair Not Found!!");
		} else {
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		FindPairSum findPairSum = new FindPairSum();
		int[] arr = { 1, 2, 3, 4, 5, 7, 6, 9, 8 };
		int sum = 10;
		findPairSum.pairSum(arr, arr.length - 1, sum);
		findPairSum.pairSumWithSorting(arr, arr.length - 1, sum);
		findPairSum.pairSumWithHashing(arr, arr.length - 1, sum);
	}
}

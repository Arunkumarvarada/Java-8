package com.java4u.ds.arrays.missingNumber;

public class MissingNumber {

	public static int missingNumber(int array[], int n) {
		if (n == 0) {
			return -1;
		} else {
			int arraySum = 0;
			int sum = (n * n + n) / 2;
			for (int a : array) {
				arraySum += a;
			}
			return (sum - arraySum);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };
		System.out.println(missingNumber(arr, 10));
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,  15, 16 };
		System.out.println(missingNumber(arr1, 15));
	}

}

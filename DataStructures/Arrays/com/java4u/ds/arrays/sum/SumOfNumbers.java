package com.java4u.ds.arrays.sum;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(calculateArraySum(arr));
		in.close();

	}

	private static long calculateArraySum(int[] arr) {
		long result = 0;
		for (int a : arr) {
			result += a;
		}
		return result;
	}

}

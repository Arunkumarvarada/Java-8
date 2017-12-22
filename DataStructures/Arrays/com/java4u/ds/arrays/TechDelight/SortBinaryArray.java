package com.java4u.ds.arrays.TechDelight;

public class SortBinaryArray {

	public static void sortBinaryArray(int[] arr, int n) {
		int zerosCount = 0;
		for (int a : arr) {
			if (a == 0) {
				zerosCount++;
			}
		}
		int k = 0;
		while (zerosCount-- != 0) {
			arr[k++] = 0;
		}
		while (k < n) {
			arr[k++] = 1;
		}
	}

	private static void print(int arr[]) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1 };
		print(arr);
		sortBinaryArray(arr, arr.length - 1);
		print(arr);
	}

}

package com.java4u.dsa.search.binarysearch;

import java.util.Arrays;

public class BinarySearchIterative {

	public boolean binarySearchIterative(int arr[], int size, int value) {
		int low = 0;
		int high = size - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == value) {
				return true;
			} else if (arr[mid] < value) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		BinarySearchIterative SearchIterative = new BinarySearchIterative();
		int arr[] = { 33, 444, 59, 76, 88, 91, 1000, 1, 45 };
		Arrays.sort(arr);
		System.out.println(
				"Element 1000 found in array = " + SearchIterative.binarySearchIterative(arr, arr.length, 1000));
		System.out.println(
				"Element 59 found in array = " + SearchIterative.binarySearchIterative(arr, arr.length, 59));
		System.out.println(
				"Element 1001 found in array = " + SearchIterative.binarySearchIterative(arr, arr.length, 1001));
	}

}

package com.java4u.dsa.search.binarysearch;

import java.util.Arrays;

public class BinarySearchRecursive {

	public boolean binarySearchRecursive(int arr[], int low, int high, int value) {
		if (low > high) {
			return false;
		}
		int mid = (low + high) / 2;
		if (arr[mid] == value) {
			return true;
		} else if (arr[mid] < value) {
			return binarySearchRecursive(arr, mid + 1, high, value);
		} else if (arr[mid] > value) {
			return binarySearchRecursive(arr, low, mid - 1, value);
		}
		return false;
	}

	public static void main(String[] args) {
		BinarySearchRecursive SearchIterative = new BinarySearchRecursive();
		int arr[] = { 33, 444, 59, 76, 88, 91, 1000, 1, 45 };
		Arrays.sort(arr);
		System.out.println(
				"Element 1000 found in array = " + SearchIterative.binarySearchRecursive(arr, 0, arr.length - 1, 1000));
		System.out.println(
				"Element 59 found in array = " + SearchIterative.binarySearchRecursive(arr, 0, arr.length - 1, 59));
		System.out.println(
				"Element 1001 found in array = " + SearchIterative.binarySearchRecursive(arr, 0, arr.length - 1, 1001));
	}

}

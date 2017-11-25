package com.java4u.dsa.search.linearsearch;

public class LinearSearchSorted {

	public boolean linearSearchSorted(int arr[], int size, int value) {
		for (int i = 0; i <= size; i++) {
			if (arr[i] == value) {
				return true;
			} else if (arr[i] > value) {
				return false;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		LinearSearchSorted linearSearchSorted = new LinearSearchSorted();
		int arr[] = { 1, 3, 5, 7, 55, 67, 77 };
		System.out.println(
				"Element 67 found in array = " + linearSearchSorted.linearSearchSorted(arr, arr.length - 1, 67));
		System.out.println(
				"Element 77 found in array = " + linearSearchSorted.linearSearchSorted(arr, arr.length - 1, 77));

	}

}

package com.java4u.dsa.search.linearsearch;

public class LinearSearchUnSorted {

	public boolean unsortedLinearSearch(int a[], int value, int size) {
		for (int i = 0; i <= size; i++) {
			if (a[i] == value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		LinearSearchUnSorted linearSearchUnSorted = new LinearSearchUnSorted();
		int arr[] = { 1, 3, 5, 7, 2, 6, 77 };
		System.out.println(
				"Element 67 found in array = " + linearSearchUnSorted.unsortedLinearSearch(arr, 67, arr.length - 1));
		System.out.println(
				"Element 77 found in array = " + linearSearchUnSorted.unsortedLinearSearch(arr, 77, arr.length - 1));
	}

}

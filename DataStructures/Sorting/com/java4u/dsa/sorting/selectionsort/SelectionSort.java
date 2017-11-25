package com.java4u.dsa.sorting.selectionsort;

public class SelectionSort {

	public void selectionSort(int[] arr) {

	}

	public void print(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 99, 24, 55, 1001, 87, 90 };
		SelectionSort sort = new SelectionSort();
		sort.selectionSort(arr);

	}

}

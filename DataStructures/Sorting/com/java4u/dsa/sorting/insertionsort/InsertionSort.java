package com.java4u.dsa.sorting.insertionsort;

public class InsertionSort {

	private void insertionSort(int[] arr) {
		System.out.println("Elements Before Sorting...");
		print(arr);

		for (int i = 1; i < arr.length; i++) {

			int j = i;
			while (j > 0 && arr[j - 1] > arr[j]) {
				int temp = arr[j - 1];
				arr[j - 1] = arr[j];
				arr[j] = temp;
				--j;
			}
		}
		System.out.println("Elements After Sorting...");
		print(arr);
	}

	public void print(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 99, 24, 55, 1001, 87, 90, 4, 5, 3, 4, 3 };
		InsertionSort sort = new InsertionSort();
		sort.insertionSort(arr);

	}

}

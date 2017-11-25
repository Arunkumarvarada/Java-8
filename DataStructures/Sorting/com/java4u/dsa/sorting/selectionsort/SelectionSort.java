package com.java4u.dsa.sorting.selectionsort;

public class SelectionSort {

	public void selectionSort(int[] arr) {
		print(arr);
		int size = arr.length;
		int i, j, max, temp;
		for (i = 0; i < size - 1; i++) {
			max = 0;
			for (j = 1; j < size - 1 - i; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
			}
			temp = arr[size - 1 - i];
			arr[size - 1 - i] = arr[max];
			arr[max] = temp;
		}

		print(arr);
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

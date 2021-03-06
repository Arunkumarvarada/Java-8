package com.java4u.dsa.sorting.mergesort;

public class MergeSort {

	private int[] numbers;
	private int[] helper;
	private int number;

	public void sort(int values[]) {
		if (values.length == 0 || values == null) {
			return;
		}
		this.numbers = values;
		number = values.length;
		this.helper = new int[number];
		print();
		mergeSort(0, number - 1);
		print();
	}

	private void mergeSort(int low, int high) {

		// check if low is smaller than high, if not then the array is sorted
		if (low < high) {
			// Get the index of the element which is in the middle
			int middle = low + (high - low) / 2;
			// Sort the left side of the array
			mergeSort(low, middle);
			// Sort the right side of the array
			mergeSort(middle + 1, high);
			// Combine them both
			merge(low, middle, high);
		}
	}

	public void merge(int low, int middle, int high) {
		// Copy both parts into the helper array
		for (int i = low; i <= high; i++) {
			helper[i] = numbers[i];
		}

		// Copy the smallest values from either the left or the right side back to the
		// original array
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (helper[i] <= helper[j]) {
				numbers[k] = helper[i];
				i++;
			} else {
				numbers[k] = helper[j];
				j++;
			}
			k++;
		}

		// Copy the rest of the left side of the array into the target array
		while (i <= middle) {
			numbers[k] = helper[i];
			k++;
			i++;
		}
	}

	private void print() {
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] values = { 4, 77, 90, 42, 54, 1, 90, 86, 71, 62 };
		new MergeSort().sort(values);
	}

}

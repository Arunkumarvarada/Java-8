package com.java4u.dsa.sorting.quicksort;

public class QuickSort {
	private int[] numbers;
	private int num;

	public void sort(int values[]) {
		if (values == null || values.length == 0) {
			return;

		}
		this.numbers = values;
		num = values.length;
		print();
		quickSort(0, num - 1);
		print();
	}

	private void quickSort(int low, int high) {
		int i = low, j = high;
		int pivot = numbers[low + (high - low) / 2];
		while (i <= j) {
			while (numbers[i] < pivot) {
				i++;
			}
			while (numbers[j] > pivot) {
				j--;
			}
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(low, j);
		}
		if (i < high) {
			quickSort(i, high);
		}
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;

	}

	private void print() {
		for (int i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] values = { 4, 77, 90, 42, 54, 1, 90, 86, 71, 62 };
		new QuickSort().sort(values);
	}

}

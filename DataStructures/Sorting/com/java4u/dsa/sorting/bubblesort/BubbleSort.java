package com.java4u.dsa.sorting.bubblesort;

public class BubbleSort {

	public void bubbleSort(int arr[]) {
		System.out.println("Elements Before Sorting");
		print(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Elements After Sorting");
		print(arr);
	}

	public void print(int arr[]) {
		for (int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 99, 24, 55, 1001, 87, 90 };
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort(arr);

	}

}

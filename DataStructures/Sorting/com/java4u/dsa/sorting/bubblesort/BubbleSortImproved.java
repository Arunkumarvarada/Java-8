package com.java4u.dsa.sorting.bubblesort;

public class BubbleSortImproved {

	public void bubbleSort(int[] arr) {
		System.out.println("Elements Before Soring");
		print(arr);
		int size = arr.length;
		int i, j, temp, swapped = 1;
		for (i = 0; i < (size - 1) && swapped == 1; i ++)
		{ 
			swapped = 0; 
			for (j = 0; j < size - i - 1; j++) 
			{ 
				if ( arr[ j]> arr[ j + 1]){
					/* Swapping */ 
					temp = arr[ j]; 
					arr[ j] = arr[ j + 1];
					arr[ j + 1] = temp; 
					swapped = 1;
				}
			}
		}
		System.out.println("Elememts After Sorting");
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
		BubbleSortImproved sort = new BubbleSortImproved();
		sort.bubbleSort(arr);

	}

}

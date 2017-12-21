package com.java4u.ds.arrays.deleteElement;

public class RemoveElementInArray {

	private static void print(int array[]) {
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int position = 3;
		int[] array = { 12, 34, 56, 76, 89, 100 };
		print(array);
		for (int i = 0; i < array.length; i++) {
			// Delete Function
			if (position == i) {
				for (int j = i + 1; i < array.length - 1; j++) {
					array[i] = array[j];
					i++;
				}
			}
		}
		print(array);

	}

}

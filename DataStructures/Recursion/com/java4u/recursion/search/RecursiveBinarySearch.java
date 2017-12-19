package com.java4u.recursion.search;

public class RecursiveBinarySearch {

	public static int binarySearch(int item, int[] array) {
		return binarySearch(0, array.length - 1, array, item);
	}

	private static int binarySearch(int startIndex, int endIndex, int[] array, int item) {
		if (endIndex < startIndex) {
			System.out.println("No solution found..");
			return -1;
		}

		int middleIndex = (startIndex + endIndex) / 2;

		if (endIndex < startIndex) {
			binarySearch(endIndex, startIndex, array, item);
		}

		if (item == array[middleIndex]) {
			return middleIndex;
		} else if (item < array[middleIndex]) {
			return binarySearch(startIndex, middleIndex - 1, array, item);
		} else {
			return binarySearch(middleIndex + 1, endIndex, array, item);
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 8, 13, 22, 26, 40, 50, 57, 60 };
		System.out.println(binarySearch(5, array));
		System.out.print(binarySearch(77, array));
	}
}

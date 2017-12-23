package com.java4u.ds.matrix.search;

public class SearchElementInMatrix {

	public static void main(String[] args) {
		int mat[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };

		search(mat, 29);
		search(mat, 90);

	}

	// O(n^2) solution
	private static void search(int[][] mat, int x) {
		boolean found = false;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Element found at index ( i , j) : (" + i + "," + j + ")");
					found = true;
				}
			}
		}
		if (found == false) {
			System.out.println("Element not found!!");
		}
	}

	// O(n) solution
	private static void search(int[][] mat, int n, int x) {

	}

}

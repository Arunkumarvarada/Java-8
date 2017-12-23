package com.java4u.ds.matrix.print;

import java.util.Arrays;

public class MatrixPrint {

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		System.out.println("===========================");
		print(mat);
		System.out.println("===========================");
		printUsingForEach(mat);
		System.out.println("===========================");
		printUsingtoString(mat);
	}

	private static void print(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void printUsingForEach(int[][] mat) {
		for (int[] row : mat) {
			for (int i : row) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	private static void printUsingtoString(int[][] mat) {
		for (int[] row : mat) {
			System.out.println(Arrays.toString(row));
		}
	}

}

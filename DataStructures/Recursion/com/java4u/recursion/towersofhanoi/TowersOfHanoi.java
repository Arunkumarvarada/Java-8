package com.java4u.recursion.towersofhanoi;

public class TowersOfHanoi {

	public void solveHanoi(int n, char rodFrom, char middleRod, char rodTo) {
		if (n == 1) {
			System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
			return;
		}
		solveHanoi(n - 1, rodFrom, rodTo, middleRod);
		System.out.println("Plate " + n + " From " + rodFrom + " to " + rodTo);
		solveHanoi(n - 1, middleRod, rodFrom, rodTo);
	}

	public static void main(String[] args) {
		new TowersOfHanoi().solveHanoi(3, 'A', 'B', 'C');
	}

}

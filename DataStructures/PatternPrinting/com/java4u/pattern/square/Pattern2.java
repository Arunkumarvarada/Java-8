package com.java4u.patternprint;

public class Pattern2 {

	public void printPattern2() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern2().printPattern2();
	}

}

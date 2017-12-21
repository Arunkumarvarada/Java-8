package com.java4u.patternprint;

public class Pattern3 {
	public void printPattern3() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern3().printPattern3();

	}

}

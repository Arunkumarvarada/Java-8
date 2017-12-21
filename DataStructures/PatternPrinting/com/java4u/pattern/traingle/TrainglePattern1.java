package com.java4u.pattern.traingle;

public class TrainglePattern1 {

	public void printPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new TrainglePattern1().printPattern();

	}

}

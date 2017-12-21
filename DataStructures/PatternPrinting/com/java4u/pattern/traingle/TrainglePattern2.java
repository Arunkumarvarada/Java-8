package com.java4u.pattern.traingle;

public class TrainglePattern2 {

	public void printPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new TrainglePattern2().printPattern();

	}

}

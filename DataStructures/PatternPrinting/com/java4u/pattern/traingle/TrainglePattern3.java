package com.java4u.pattern.traingle;

public class TrainglePattern3 {

	public void printPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new TrainglePattern3().printPattern();

	}

}

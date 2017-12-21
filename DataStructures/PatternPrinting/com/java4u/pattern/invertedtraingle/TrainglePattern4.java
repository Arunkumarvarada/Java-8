package com.java4u.pattern.invertedtraingle;

public class TrainglePattern4 {

	public void printPattern() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print((char) (i+65));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new TrainglePattern4().printPattern();

	}

}

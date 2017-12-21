package com.java4u.pattern.invertedtraingle;

public class TrainglePattern5 {

	public void printPattern() {
		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) (j + 65));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new TrainglePattern5().printPattern();

	}

}

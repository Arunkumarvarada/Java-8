package com.java4u.pattern.traingle;

public class TrainglePattern4 {

	public void printPattern() {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new TrainglePattern4().printPattern();

	}

}

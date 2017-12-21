package com.java4u.patternprint;

public class Pattern4 {

	public void printPattern4() {

		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern4().printPattern4();
	}

}

package com.java4u.patternprint;

public class Pattern5 {

	public void printPattern5() {

		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern5().printPattern5();
	}

}

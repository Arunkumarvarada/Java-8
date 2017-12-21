package com.java4u.pattern.square;

public class Pattern9 {
	public void printPattern9() {
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'E'; j >= 'A'; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern9().printPattern9();

	}

}

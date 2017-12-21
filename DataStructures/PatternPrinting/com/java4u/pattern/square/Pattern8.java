package com.java4u.pattern.square;

public class Pattern8 {
	public void printPattern8() {
		for (char i = 'E'; i >= 'A'; i--) {
			for (char j = 'E'; j >= 'A'; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern8().printPattern8();

	}

}

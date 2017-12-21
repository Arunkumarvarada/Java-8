package com.java4u.pattern.square;

public class Pattern1 {

	public void printPattern1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern1().printPattern1();
	}

}

package com.java4u.pattern.square;

public class Pattern7 {
	public void printPattern7() {
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern7().printPattern7();

	}

}

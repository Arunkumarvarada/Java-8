package com.java4u.pattern.square;

public class Pattern6 {

	public void printPattern6() {
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Pattern6().printPattern6();
	}

}

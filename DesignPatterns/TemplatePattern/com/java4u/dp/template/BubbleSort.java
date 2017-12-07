package com.java4u.dp.template;

public class BubbleSort extends Algorithm {
	private int[] numbers;

	public BubbleSort(int[] numbers) {
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		System.out.println("Initializing the Bubble Sorting Implemantation......");

	}

	@Override
	public void sorting() {
		int n = this.numbers.length;
		int temp;

		while (n != 0) {

			temp = 0;

			for (int i = 1; i < n; i++) {
				if (numbers[i - 1] > numbers[i]) {
					int swap = numbers[i - 1];
					numbers[i - 1] = numbers[i];
					numbers[i] = swap;
					temp = i;
				}
			}

			n = temp;

		}

	}

	@Override
	public void printResult() {
		for (int i : numbers) {
			System.out.println(numbers[i]);
		}

	}

}

package com.java4u.dp.template.test;

import com.java4u.dp.template.Algorithm;
import com.java4u.dp.template.BubbleSort;

public class TestTemplatePattern {

	public static void main(String[] args) {
		int[] numbers = { 100, 5, 7, -6, 0 };

		Algorithm bubblesort = new BubbleSort(numbers);

		bubblesort.sort();

	}

}

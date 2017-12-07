package com.java4u.dp.facade.test;

import com.java4u.dp.facade.SortingManager;

public class TestFacdePattern {
	public static void main(String[] args) {
		SortingManager manager = new SortingManager();
		manager.doInsertionSort();
		manager.doMergeSort();
		manager.doQuickSort();
	}
}

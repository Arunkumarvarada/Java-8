package com.java4u.dp.facade;

public class SortingManager {
	private SortAlgorithm insertionSort;
	private SortAlgorithm mergeSort;
	private SortAlgorithm quickSort;

	public SortingManager() {
		super();
		this.insertionSort = new InsertionSort();
		this.mergeSort = new MergeSort();
		this.quickSort = new QuickSort();
	}

	public void doQuickSort() {
		this.quickSort.sort();
	}

	public void doInsertionSort() {
		this.insertionSort.sort();
	}

	public void doMergeSort() {
		this.mergeSort.sort();
	}

}

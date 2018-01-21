package com.java4u.ds.vector;

import java.util.Arrays;


public class CustomVector<E> {

	private int capacity = 10;
	private Object[] elementData = {};
	private int size = 0;

	CustomVector() {
		elementData = new Object[capacity];
	}

	public synchronized void add(E e) {
		if (size == elementData.length) {
			ensureCapacity();
		}
		elementData[size++] = e;
	}

	private void ensureCapacity() {
		int newEnsuredCapacity = capacity * 2;
		elementData = Arrays.copyOf(elementData, newEnsuredCapacity);
	}

	public void display() {
		System.out.println("Displaying the Elements of Vector :: ");
		for (int i = 0; i < size; i++) {
			System.out.println(elementData[i] + " ");
		}
	}

	public E get(int index) {
		if (index < 0 && index > size) {
			throw new ArrayIndexOutOfBoundsException("Index : " + index + ", Size : " + size);
		}
		return (E) elementData[index];
	}

	public synchronized Object remove(int index) {
		if (index < 0 && index > size) {
			throw new ArrayIndexOutOfBoundsException("Index : " + index + ", Size : " + size);
		}
		Object removedlement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--;
		return removedlement;
	}
}

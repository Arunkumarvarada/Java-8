package com.java4u.ds.arraylist;

import java.util.Arrays;

public class ArrayListCustom<E> {
	private int capacity = 10;
	private Object elementData[] = {};
	private int size = 0;

	public ArrayListCustom() {
		elementData = new Object[capacity];
	}

	public void add(E e) {
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
		for (int i = 0; i < size; i++) {
			System.out.print(elementData[i] + " ");
		}
	}

	public Object remove(int index) {
		if (index < 0 && index > size) {
			throw new ArrayIndexOutOfBoundsException("Index :" + index + ", Size :" + size);
		}
		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];

		}
		size--;

		return removedElement;
	}

	public E get(int index) {
		if (index < 0 && index > size) {
			throw new ArrayIndexOutOfBoundsException("Index :" + index + ", Size :" + size);
		}
		return (E) elementData[index];
	}

}

package com.java4u.ds.doublelinkedlist;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
		list.insertAtBeginning(1);
		list.insertAtBeginning(22);
		list.insertAtEnd(34);
		list.insertAtBeginning(23);
		list.insertAtEnd(3);
		list.insertAtBeginning(24);
		list.traverse();
		System.out.println("Size of the List is :: " + list.getSize());

		list.delete(22);
		list.traverse();
		list.delete(3);
		list.traverse();
		list.delete(24);
		list.traverse();
		System.out.println("Size of the List is :: " + list.getSize());
	}

}

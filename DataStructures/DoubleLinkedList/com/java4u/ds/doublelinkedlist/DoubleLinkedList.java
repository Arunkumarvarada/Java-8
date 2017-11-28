package com.java4u.ds.doublelinkedlist;

public class DoubleLinkedList {

	private DLLNode head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public void insertAtBeginning(int data) {
		DLLNode newNode = new DLLNode(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			newNode.setPrevious(null);
			head.setPrevious(newNode);
			head = newNode;
		}
		size++;
	}

	public void insertAtEnd(int data) {
		DLLNode newNode = new DLLNode(data);
		newNode.setNext(null);
		DLLNode last = head;

		if (head == null) {
			newNode.setPrevious(null);
			head = newNode;
			size++;
			return;
		}
		while (last.getNext() != null) {
			last = last.getNext();
		}
		last.setNext(newNode);
		newNode.setPrevious(last);
		size++;
	}

	public void delete(int data) {
		// if no elements are in list
		if (head == null) {
			System.out.println("There are no elements in the list!!!");
			return;
		}
		// if node is at beginning
		if (head.getData() == data) {
			DLLNode temp = head;
			head = head.getNext();
			head.setPrevious(null);
			temp = null;
			size--;
			return;

		} else {
			DLLNode previous;
			DLLNode current = head;
			DLLNode future;
			// if node is deleted at middle
			while (null != current.getNext()) {
				if (data == current.getData()) {
					previous = current.getPrevious();
					future = current.getNext();
					previous.setNext(current.getNext());
					future.setPrevious(current.getPrevious());
					current.setNext(null);
					current.setPrevious(null);
					current = null;
					size--;
					return;
				}
				current= current.getNext();
			}
			// if node is last node
			if (data == current.getData()) {
				previous = current.getPrevious();
				previous.setNext(current.getNext());
				current.setNext(null);
				current.setPrevious(null);
				current = null;
				size--;
				return;
			} else {
				System.out.println("No Specified Elements in the list!!");
			}

		}
	}

	public void traverse() {
		if (head == null) {
			return;
		}
		DLLNode current = head;
		while (current != null) {
			System.out.print(current.getData() + " --> ");
			current = current.getNext();
		}
		System.out.println();
	}
}

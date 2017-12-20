package com.java4u.ds.linkedlist.reverselist;

import com.java4u.ds.linkedlist.Node;

public class ReverseLinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void reverseLinkedListRecursive() {
		reverseLinkedListRecursive(head);
	}

	public void reverseLinkedListRecursive(Node current) {

		if (current == null) {
			return;
		}
		if (current.getNext() == null) {
			this.head = current;
			return;
		}
		reverseLinkedListRecursive(current.getNext());
		current.getNext().setNext(current);
		current.setNext(null);

	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		list.createTestList(5);
		list.printlist();
		list.reverseLinkedListRecursive();
		list.printlist();

	}

	public void printlist() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println("X");

	}

	public void createTestList(int n) {
		if (n < 1)
			return;
		int i = 1;
		Node temp = null;
		while (i <= n) {
			Node node = new Node(i);
			if (head == null) {
				head = node;
				temp = head;
			} else {
				temp.setNext(node);
				temp = node;
			}
			i++;
		}

	}

}

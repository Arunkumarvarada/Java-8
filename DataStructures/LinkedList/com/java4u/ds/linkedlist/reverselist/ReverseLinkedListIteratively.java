package com.java4u.ds.linkedlist.reverselist;

import com.java4u.ds.linkedlist.Node;

public class ReverseLinkedListIteratively {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void reverseLinkedListIterative() {
		Node prev = null;
		Node current = null;
		Node next = head;

		while (next != null) {
			current = next;
			next = current.getNext();
			current.setNext(prev);
			prev = current;
		}
		head = current;
	}

	public static void main(String[] args) {
		ReverseLinkedListIteratively list = new ReverseLinkedListIteratively();
		list.createTestList(5);
		list.printlist();
		list.reverseLinkedListIterative();
		list.printlist();

	}

	private void printlist() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
		System.out.println("X");

	}

	private void createTestList(int n) {
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

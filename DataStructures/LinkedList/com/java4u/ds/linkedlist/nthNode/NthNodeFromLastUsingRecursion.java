package com.java4u.ds.linkedlist.nthNode;

import com.java4u.ds.linkedlist.Node;

public class NthNodeFromLastUsingRecursion {

	int count = 0;

	public int nthNodeFromEnd(Node head, int nodeFromLast) {

		if (nodeFromLast <= 0 || head == null) {
			return -1;
		}

		Node ptrA = head, ptrB = head;

		// Moving ptrB N nodes from start keeping ptrA at head node.
		for (int i = 0; i < nodeFromLast; i++) {

			// If ptrB reaches NULL, then return -1 as indication that given Nth value is
			// incorrect and list doesn't contain N elements.
			if (ptrB == null) {
				return -1;
			}
			ptrB = ptrB.getNext();
		}

		// Now incrementing ptrA and ptrB one node at a time until ptrB encounters NULL,
		// when it encounters NULL then ptrA will be at Nth position from end of list.
		while (ptrB != null) {
			ptrB = ptrB.getNext();
			ptrA = ptrA.getNext();
		}

		return ptrA.getData();

	}

	public static void main(String[] args) {
		NthNodeFromLastUsingRecursion list = new NthNodeFromLastUsingRecursion();
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		System.out.println(list.nthNodeFromEnd(head, 2));
	}

}

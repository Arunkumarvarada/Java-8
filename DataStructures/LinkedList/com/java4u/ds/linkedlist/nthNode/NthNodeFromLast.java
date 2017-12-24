package com.java4u.ds.linkedlist.nthNode;

import com.java4u.ds.linkedlist.Node;

public class NthNodeFromLast {
	public int NthNodeFromEnd(Node head, int nodeFromLast) {

		if (nodeFromLast <= 0 || head == null) {
			return -1;
		}

		Node ptrA = head, ptrB = head;

		for (int i = 0; i < nodeFromLast; i++) {

			if (ptrB == null) {
				return -1;
			}
			ptrB = ptrB.getNext();
		}
		while (ptrB != null) {
			ptrB = ptrB.getNext();
			ptrA = ptrA.getNext();
		}

		return ptrA.getData();

	}

	public static void main(String[] args) {
		NthNodeFromLast list = new NthNodeFromLast();

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
		System.out.println(list.NthNodeFromEnd(head, 2));

	}
}

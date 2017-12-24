package com.java4u.ds.linkedlist.nthNode;

import com.java4u.ds.linkedlist.Node;

public class NthNodeFromLast {
	public Node NthNodeFromEnd(Node head, int n) {
		Node temp = head;
		Node pthNode = null;
		for (int i = 0; i < n; i++) {
			if (temp != null) {
				temp = temp.getNext();
			}
		}
		while (temp != null) {
			if (pthNode != null) {
				pthNode = head;
			} else {
				pthNode = pthNode.getNext();
			}
			temp = temp.getNext();
		}

		if (pthNode != null) {
			return pthNode;
		} else {
			return null;
		}

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
		Node node = list.NthNodeFromEnd(head, 2);
		if (node != null) {
			System.out.println(node.getData());
		}

	}
}

package com.java4u.linkedlist.evenlength;

import com.java4u.ds.linkedlist.Node;

public class IsEvenLength {

	public boolean isEvenLength(Node head) {
		int count = 0;
		if (head == null) {
			return false;
		}
		Node fast = head;
		while (fast != null) {
			count++;
			fast = fast.getNext();
		}
		System.out.println(count);
		if (count % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(6);
		Node n5 = new Node(7);
		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(new Node(7));
		System.out.println(new IsEvenLength().isEvenLength(head));
	}

}

package com.java4u.ds.circularlinkedlist.displayNodes;

import com.java4u.ds.linkedlist.Node;

public class DsiplayNodes {

	public static void displayNodes(Node head) {
		Node start = head;
		if (head != null) {
			do {
				System.out.print(head.getData() + " ");
				head = head.getNext();
			} while (head != start);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(2);
		Node n6 = new Node(6);

		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(head);
		
		displayNodes(head);
	}

}

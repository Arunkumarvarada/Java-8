package com.java4u.ds.linkedlist.exchangeAdjacentNodes;

import com.java4u.ds.linkedlist.Node;

public class ReverseInPairUsingRecursion {

	public Node reverseinPairRecursive(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node remaing = head.next.next;
		Node newhead = head.next;
		head.next.next = head;
		head.next = reverseinPairRecursive(remaing);
		return newhead;
	}

	public static void print(Node current) {
		while (current != null) {
			System.out.print(current.getData() + " -->");
			current = current.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);

		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);

		print(head);
		Node node = new ReverseInPairUsingRecursion().reverseinPairRecursive(head);
		print(node);
	}

}

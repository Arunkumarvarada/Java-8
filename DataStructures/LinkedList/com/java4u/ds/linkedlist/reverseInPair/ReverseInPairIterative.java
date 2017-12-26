package com.java4u.ds.linkedlist.reverseInPair;

import com.java4u.ds.linkedlist.Node;

public class ReverseInPairIterative {

	public Node reverseinPairIterative(Node node) {
		if (node == null || node.next == null) {
			return null;
		}
		Node prev = node;
		Node curr = node.next;

		node = curr;

		while (true) {
			Node next = curr.next;
			curr.next = prev;

			if (next == null || next.next == null) {
				prev.next = next;
				break;
			}

			prev.next = next.next;
			prev = next;
			curr = prev.next;
		}
		return node;
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
		Node node = new ReverseInPairIterative().reverseinPairIterative(head);
		print(node);
	}

}

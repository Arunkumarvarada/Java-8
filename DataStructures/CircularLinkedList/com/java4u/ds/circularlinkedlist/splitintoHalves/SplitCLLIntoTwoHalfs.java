package com.java4u.ds.circularlinkedlist.splitintoHalves;

import com.java4u.ds.linkedlist.Node;

public class SplitCLLIntoTwoHalfs {
	static Node head, head1, head2;

	public static void splitTwoHalves() {
		Node slow_ptr = head;
		Node fast_ptr = head;

		if (head == null) {
			return;
		}

		while (fast_ptr.next != head && fast_ptr.next.next != head) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}

		if (fast_ptr.next.next == head) {
			fast_ptr = fast_ptr.next;
		}

		head1 = head;

		if (head.next != head) {
			head2 = slow_ptr.next;
		}

		fast_ptr.next = slow_ptr.next;

		slow_ptr.next = head;
	}

	public static void main(String[] args) {

		// Created linked list will be 12->56->2->11
		head = new Node(12);
		head.next = new Node(56);
		head.next.next = new Node(2);
		head.next.next.next = new Node(11);
		head.next.next.next.next = new Node(13);
		head.next.next.next.next.next = head;

		System.out.println("Original Circular Linked list ");
		printList(head);

		// Split the list
		splitTwoHalves();
		System.out.println("");
		System.out.println("First Circular List ");
		printList(head1);
		System.out.println("");
		System.out.println("Second Circular List ");
		printList(head2);

	}

	private static void printList(Node node) {
		Node temp = node;
		if (node != null) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != node);
		}
	}

}

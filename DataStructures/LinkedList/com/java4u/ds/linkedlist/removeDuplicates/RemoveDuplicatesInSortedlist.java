package com.java4u.ds.linkedlist.removeDuplicates;

import com.java4u.ds.linkedlist.Node;

public class RemoveDuplicatesInSortedlist {

	public Node removeDuplicatesInSortedList(Node head) {
		Node current = head;
		Node next_next;
		if (head == null)
			return head;
		while (current.next != null) {
			if (current.data == current.next.data) {
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			} else
				current = current.next;
		}
		return head;
	}

	static void print(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(5);

		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);

		print(head);
		Node node = new RemoveDuplicatesInSortedlist().removeDuplicatesInSortedList(head);
		print(node);

	}

}

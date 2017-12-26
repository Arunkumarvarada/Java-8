package com.java4u.ds.linkedlist.partitionList;

import com.java4u.ds.linkedlist.Node;

public class PartitionListBasedOnPivot {

	private static Node partition(Node node, int data) {
		Node beforeStart = null;
		Node beforeEnd = null;
		Node afterStart = null;
		Node afterEnd = null;

		/* Partition list */
		while (node != null) {
			Node next = node.getNext();
			node.setNext(null);
			if (node.getData() < data) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.setNext(node);
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.setNext(node);
					afterEnd = node;
				}
			}
			node = next;
		}

		/* Merge before list and after list */
		if (beforeStart == null) {
			return afterStart;
		}

		beforeEnd.setNext(afterStart);
		return beforeStart;
	}

	public static void main(String[] args) {
		/* Start with the empty list */
		Node head = new Node(3);
		head.next = new Node(5);
		head.next.next = new Node(8);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(10);
		head.next.next.next.next.next = new Node(2);
		head.next.next.next.next.next.next = new Node(1);

		int x = 5;
		printList(head);
		head = partition(head, x);
		printList(head);

	}

	private static void printList(Node head) {
		while (head != null) {
			System.out.print(head.getData() + " ");
			head= head.getNext();
		}
		System.out.println();
	}

}

package com.java4u.ds.linkedlist.insertNodeintoSortedList;

import com.java4u.ds.linkedlist.Node;

public class InsertNodeInSortedList {
	public Node insertNodeInSortedList(Node head, Node newNode) {
		Node current = head;
		if (head == null) {
			return newNode;
		}
		Node temp = null;
		while (current != null && current.getData() < newNode.getData()) {
			temp = current;
			current = current.getNext();
		}
		newNode.setNext(current);
		temp.setNext(newNode);
		return head;
	}

	private static void print(Node head) {
		if (head == null) {
			return;
		}
		System.out.print(head.getData() + " ");
		print(head.getNext());
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
		System.out.println("Before Insertion of Node :");
		print(head);
		System.out.println();
		Node node = new Node(5);
		new InsertNodeInSortedList().insertNodeInSortedList(head, node);
		System.out.println("After Insertion of Node :");
		print(head);
		System.out.println();
	}

}

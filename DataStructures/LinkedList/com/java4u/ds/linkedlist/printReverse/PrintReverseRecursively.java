package com.java4u.ds.linkedlist.printReverse;

import com.java4u.ds.linkedlist.Node;

public class PrintReverseRecursively {

	public void printListUsingRecursion(Node current) {
		if (current == null) {
			return;
		} else {
			System.out.print(current.getData() + " ");
			printListUsingRecursion(current.getNext());
		}
	}

	public void printReverseRecursive(Node current) {
		if (current == null) {
			return;
		}
		printReverseRecursive(current.getNext());
		System.out.print(current.getData() + " ");

	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		head.setNext(node1);
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		System.out.println("Printing Node list original:: ");
		new PrintReverseRecursively().printListUsingRecursion(head);
		System.out.println();
		System.out.println("Printing Node list Reversing:: ");
		new PrintReverseRecursively().printReverseRecursive(head);
	}

}

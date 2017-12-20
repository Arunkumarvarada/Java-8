package com.java4u.ds.linkedlist.printReverse;

import com.java4u.ds.linkedlist.Node;

public class PrintReverseIteratively {
	public void print(Node current) {
		while (current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
	}

	//TODO: Need to Complete
	public void printReverse(Node current) {
		
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
		new PrintReverseIteratively().print(head);
		
	}

}

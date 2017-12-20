package com.java4u.ds.linkedlist.middleNode;

import com.java4u.ds.linkedlist.Node;

public class MiddleNode {

	public static Node findMiddleNode(Node current) {
		if (current == null) {
			return current;
		}
		if (current.getNext() == null) {
			return current;
		}
		Node slow = current;
		Node fast = current;

		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		return slow;
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
		Node middleNode = findMiddleNode(head);
		System.out.println(middleNode.getData());

	}

}

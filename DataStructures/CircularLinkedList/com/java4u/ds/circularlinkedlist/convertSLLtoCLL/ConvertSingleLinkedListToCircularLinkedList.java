package com.java4u.ds.circularlinkedlist.convertSLLtoCLL;

import com.java4u.ds.linkedlist.Node;

public class ConvertSingleLinkedListToCircularLinkedList {

	public static Node convertSLLToCLL(Node head) {
		if (head == null) {
			return head;
		}
		Node start = head;
		while (head.getNext() != null) {
			head = head.getNext();
		}
		head.setNext(start);
		return start;
	}

	public static void printSLL(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void printCLL(Node head) {
		Node start = head;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
			if (head == start) {
				break;
			}
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
		printSLL(head);
		convertSLLToCLL(head);
		printCLL(head);

	}

}

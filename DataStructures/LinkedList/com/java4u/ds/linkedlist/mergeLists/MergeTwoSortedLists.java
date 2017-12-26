package com.java4u.ds.linkedlist.mergeLists;

import com.java4u.ds.linkedlist.Node;

public class MergeTwoSortedLists {
	public Node mergeTwoSortedlists(Node head1, Node head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		Node head = new Node(0);
		if (head1.getData() <= head2.getData()) {
			head = head1;
			head.setNext(mergeTwoSortedlists(head1.getNext(), head2));
		} else {
			head = head2;
			head.setNext(mergeTwoSortedlists(head2.getNext(), head1));
		}
		return head;
	}

	public static void print(Node current) {
		while (current != null) {
			System.out.print(current.getData() + " -->");
			current = current.getNext();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Setting values for head1
		Node head1 = new Node(1);
		Node n1 = new Node(3);
		Node n2 = new Node(5);
		Node n3 = new Node(7);
		Node n4 = new Node(9);
		
		head1.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);

		// Setting values for head2
		Node head2 = new Node(2);
		Node n5 = new Node(4);
		Node n6 = new Node(6);
		Node n7 = new Node(8);
		Node n8 = new Node(10);
		
		head2.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		
		print(head1);
		print(head2);
		Node node = new MergeTwoSortedLists().mergeTwoSortedlists(head1, head2);
		print(node);

	}

}

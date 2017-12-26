package com.java4u.ds.linkedlist.removeDuplicates;

import java.util.HashSet;

import com.java4u.ds.linkedlist.Node;

public class RemoveDuplicatesUsingHashing {

	public Node removeDuplicateInList(Node head) {
		if (head == null) {
			return head;
		}
		HashSet<Integer> set = new HashSet<>();
		Node current = head;
		Node prev = null;
		while (current != null) {
			int curval = current.getData();
			if (set.contains(curval)) {
				prev.setNext(current.getNext());
			} else {
				set.add(curval);
				prev = current;
			}
			current = current.getNext();
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
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(2);
		Node n6 = new Node(6);

		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		
		print(head);
		Node node = new RemoveDuplicatesUsingHashing().removeDuplicateInList(head);
		print(node);

	}

}

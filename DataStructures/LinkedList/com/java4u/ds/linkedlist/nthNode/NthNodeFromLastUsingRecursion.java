package com.java4u.ds.linkedlist.nthNode;

import com.java4u.ds.linkedlist.Node;

public class NthNodeFromLastUsingRecursion {

	int count = 0;

	public int nthNodeFromEnd(Node head, int nodeFromLast) {
		if (head == null) {
			return -1;
		}
		int data = nthNodeFromEnd(head.getNext(), nodeFromLast);
		count++;
		if (count == nodeFromLast) {
			return head.getData();
		}
		return data;
	}

	public static void main(String[] args) {
		NthNodeFromLastUsingRecursion list = new NthNodeFromLastUsingRecursion();
		Node head = new Node(1);
		Node n1 = new Node(2);
		Node n2 = new Node(3);
		Node n3 = new Node(4);
		Node n4 = new Node(5);
		Node n5 = new Node(6);
		head.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		System.out.println(list.nthNodeFromEnd(head, 2));
	}

}

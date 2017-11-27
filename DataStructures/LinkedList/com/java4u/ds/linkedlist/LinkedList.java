package com.java4u.ds.linkedlist;

public class LinkedList {
	private Node headNode = null;
	private int size = 0;

	public LinkedList(Node head) {
		this.headNode = head;
	}

	public boolean isEmpty() {
		if (headNode == null) {
			return true;
		}
		return false;
	}

	protected Node gethead() {
		return headNode;
	}

	public int getSize() {
		int count = 0;
		if (headNode == null) {
			return 0;
		}
		Node currentNode = headNode;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.getNext();
		}
		return count;
	}

	public void travese() {
		Node currentNode = headNode;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + "-->");
			currentNode = currentNode.getNext();
		}
	}

	public void reverseRecursive() {
		Node prev = null;
		reverseRec(prev, headNode);

	}

	private void reverseRec(Node prev, Node current) {
		if (null == current) {
			headNode = prev;
			return;
		}
		Node temp = current.getNext();
		current.setNext(prev);
		reverseRec(current, temp);
	}

	public void printReverse() {
		printRev(headNode);
	}

	private void printRev(Node current) {
		if (current == null) {
			return;
		}
		printRev(current.getNext());
		System.out.print(" " + current.getData());
	}

	public void reverse() {
		Node prev = null;
		Node current = headNode;
		while (current != null) {
			Node temp = current.getNext();
			prev = current;
			current = temp;
		}
		headNode = prev;
	}

	public Node getMiddle() {
		if (headNode == null) {
			return headNode;
		}
		Node slow, fast;
		slow = fast = headNode;
		while (fast != null && slow != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (null == headNode) {
			headNode = newNode;
		} else {
			Node temp = headNode;
			while (temp != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
	}

	public void insertBefore(int data) {
		Node newNode = new Node(data);
		if (null == headNode) {
			newNode = headNode;
		} else {
			newNode.setNext(headNode);
			headNode = newNode;
		}
		size++;
	}

	public Node insertNode(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			return headNode;
		} else {
			Node temp = headNode;
			while (null != temp) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
		return newNode;
	}

	public void delete(int data) {
		if (headNode == null) {
			System.out.println("No Elements are there in this list!!");
			return;
		}
		if (headNode.getData() == data) {
			Node temp = headNode;
			headNode = headNode.getNext();
			temp = null;
			size--;
			return;
		} else {
			Node previous = headNode;
			Node current = previous.getNext();
			while (current != null) {
				if (current.getData() == data) {
					previous.setNext(current.getNext());
					current.setNext(null);
					return;
				}
				previous = current;
				current = current.getNext();
			}
			if (current == null) {
				System.out.println("No Specified Element found in the list!!");
			}
		}
		size--;
	}
}

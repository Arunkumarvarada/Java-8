package com.java4u.ds.linkedlist;

public class LinkedList {
	private Node head = null;
	private int size = 0;

	public LinkedList(Node head) {
		this.head = head;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

	protected Node gethead() {
		return head;
	}

	public int getSize() {
		int count = 0;
		if (head == null) {
			return 0;
		}
		Node currentNode = head;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.getNext();
		}
		return count;
	}

	public void travese() {
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + "-->");
			currentNode = currentNode.getNext();
		}
	}

	public void reverseRecursive() {
		Node prev = null;
		reverseRec(prev, head);

	}

	private void reverseRec(Node prev, Node current) {
		if (null == current) {
			head = prev;
			return;
		}
		Node temp = current.getNext();
		current.setNext(prev);
		reverseRec(current, temp);
	}

	public void printReverse() {
		printRev(head);
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
		Node current = head;
		while (current != null) {
			Node temp = current.getNext();
			prev = current;
			current = temp;
		}
		head = prev;
	}

	public Node getMiddle() {
		if (head == null) {
			return head;
		}
		Node slow, fast;
		slow = fast = head;
		while (fast != null && slow != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	public void insert(int data) {
		Node newNode = new Node(data);
		if (null == head) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
	}

	public void insertBefore(int data) {
		Node newNode = new Node(data);
		if (null == head) {
			newNode = head;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}

	public Node insertNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		} else {
			Node temp = head;
			while (null != temp) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
		}
		size++;
		return newNode;
	}

	public void insert(int position, int data) {
		if (position < 0) {
			position = 0;
		}
		if (position > size) {
			position = size;
		}
		if (head == null) {
			head = new Node(data);
		}
		if (position == 0) {
			Node current = new Node(data);
			current.setNext(head);
			head = current;
		} else {
			Node temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			Node newNode = new Node(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		size++;
	}

	public void delete(int data) {
		if (head == null) {
			System.out.println("No Elements are there in this list!!");
			return;
		}
		if (head.getData() == data) {
			Node temp = head;
			head = head.getNext();
			temp = null;
			size--;
			return;
		} else {
			Node previous = head;
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

	public void deleteAtBeginning() {
		if (head == null) {
			System.out.println("No Elements are there in this list !!");
		}
		Node temp = head;
		head = head.getNext();
		temp = null;
		size--;
	}

	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("No Elements are there in this list !!");
		}
		Node previous = head;
		Node current = previous.getNext();
		while (current != null) {
			previous = current;
			current = current.getNext();
		}
		previous.setNext(current.getNext());
		current.setNext(null);
	}

	public void delete(int data, int position) {
		if (position < 0) {
			deleteAtBeginning();
		}
		if (position > size) {
			deleteAtEnd();
		}
		if (head == null) {
			System.out.println("No Elements are there in the list!!");
		} else {
			Node previous = head;
			Node current = previous.getNext();
			for (int i = 0; i < position; i++) {
				previous = current;
				current = current.getNext();
			}
			previous.setNext(current.getNext());
			current.setNext(null);
		}
	}
}

package com.java4u.ds.linkedlist;

public class LinkedList {
	private Node head = null;
	private int size = 0;

	public LinkedList(Node head) {
		this.head = head;
	}

	public LinkedList() {

	}

	public boolean isEmpty() {
		return (head == null) ? true : false;
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
		System.out.println();
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
		System.out.println();
	}

	private void printRev(Node current) {
		if (current == null) {
			return;
		}
		printRev(current.getNext());
		System.out.print(current.getData() + "-->");
	}

	public void reverse() {
		Node prev = null;
		Node current = null;
		Node next = head;
		while (next != null) {
			current = next;
			next = current.getNext();
			current.setNext(prev);
			prev=current;
		}
		head = current;
	}

	public Node getMiddle() {
		if (head == null) {
			return head;
		}
		if (head.getNext() == null) {
			return head;
		}
		Node slow, fast;
		slow = fast = head;
		while (fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		return slow;
	}

	public void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		if (null == head) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}

	public Node insertAtEnd(int data) {
		Node temp = null;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return head;
		} else {
			temp = head;
			while (null != temp.getNext()) {
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

	public void deleteData(int data) {
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
				System.out.println("No Specified Element found in the list :: " + data);
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
			return;
		} else {
			Node previous = head;
			Node current = previous.getNext();
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
			}
			previous.setNext(current.getNext());
			current.setNext(null);
		}
		size--;
	}

	public void deleteBasedOnPosition(int position) {
		if (position < 0) {
			position = 0;
		}
		getLenth();
		if (position >= size) {
			position = size - 1;
		}

		if (head == null) {
			return;
		}
		if (position == 0) {
			Node temp = head;
			head = head.getNext();
			temp = null;
		} else {
			Node temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			temp.setNext(temp.getNext().getNext());
		}
		size--;
	}

	public int getLenth() {
		int count = 0;
		if (head == null) {
			return 0;
		} else {
			Node current = head;
			while (current != null) {
				++count;
				current = current.getNext();
			}
			size = count;
		}
		return size;
	}

	public Node insertWithReturn(int data) {
		Node newNode = new Node(data);
		if (null == head) {
			head = newNode;
			return head;

		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			temp.setNext(newNode);
			return newNode;
		}

	}
}

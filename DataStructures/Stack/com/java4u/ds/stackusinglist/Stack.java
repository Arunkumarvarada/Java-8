package com.java4u.ds.stackusinglist;

public class Stack {
	private StackNode top = null;

	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if (isEmpty()) {
			top = newNode;
			return;
		} else {
			newNode.setNext(top);
			top = newNode;
		}
	}

	public int pop() {
		int value = 0;
		StackNode temp = top;
		if (null == temp) {
			System.out.println("Stack is Empty");
		} else {
			top = top.getNext();
			value = temp.getData();
			temp = null;
		}
		return value;
	}

	public int peek() {
		if (null != top) {
			return top.getData();
		}
		return 0;
	}

	public boolean isEmpty() {
		return (top == null) ? true : false;
	}

	public void traverse() {
		System.out.println("Traversiong the Stack..");
		StackNode tmp = top;
		while (null != tmp) {
			System.out.println(" " + tmp.getData());
			tmp = tmp.getNext();
		}
		System.out.println();
	}
}

package com.java4u.ds.stack.minstack;

import com.java4u.ds.stackusinglist.Stack;

public class MinStack extends Stack {

	private Stack genStack = new Stack();
	private Stack minStack = new Stack();

	public void push(int data) {
		genStack.push(data);
		if (minStack.isEmpty() || minStack.peek() >= data) {
			minStack.push(data);
		}
	}

	public int pop() {
		int value = genStack.pop();
		if (minStack.peek() == value) {
			minStack.pop();
		}
		return value;
	}

	public void traverse() {
		genStack.traverse();
	}

	public int peek() {
		return genStack.peek();
	}

	public int getMinimum() {
		return minStack.peek();
	}
}

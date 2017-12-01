package com.java4u.ds.stack.minstack;

public class MinStackDemo {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(23);
		minStack.push(34);
		minStack.push(45);
		minStack.push(65);
		minStack.push(12);
		minStack.push(31);
		minStack.push(43);
		minStack.push(53);
		minStack.push(41);
		minStack.traverse();
		System.out.println("Minimum in stack is :: "+minStack.getMinimum());
		minStack.pop();
		minStack.pop();
		minStack.pop();
		minStack.pop();
		minStack.pop();
		minStack.traverse();
		System.out.println("Minimum in stack is :: "+minStack.getMinimum());
		System.out.println("Minimum in stack is :: "+minStack.peek());

	}

}

package com.java4u.ds.stack.array;

public class StackUsingArray {

	private int MAX_SIZE = 10;
	private int stack[];
	private int top;

	public StackUsingArray(int size) {
		this.MAX_SIZE = size;
		stack = new int[MAX_SIZE];
		top = -1;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("No Elements are present in the stack!!");
		}
		for (int i : stack) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public void push(int data) throws Exception {
		if (isStackFull()) {
			throw new Exception("Stack is Full");
		}
		stack[++top] = data;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return stack[top];
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		return stack[top--];
	}

	public boolean isEmpty() {
		return (top == -1) ? true : false;
	}

	public boolean isStackFull() {
		return (top == MAX_SIZE - 1);
	}

	public int getsize() {
		return top + 1;
	}

	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(10);
		try {
			System.out.println(stack.isEmpty());
			stack.push(23);
			stack.push(22);
			stack.push(24);
			stack.push(25);
			stack.push(27);
			stack.push(28);
			stack.push(29);
			stack.push(20);
			stack.push(21);
			stack.push(31);
			stack.print();
			System.out.println(stack.getsize());
			System.out.println(stack.isStackFull());
			// stack.push(33);
			System.out.println(stack.pop());
			System.out.println(stack.pop());
			System.out.println(stack.peek());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

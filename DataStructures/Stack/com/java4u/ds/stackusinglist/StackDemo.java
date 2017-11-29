package com.java4u.ds.stackusinglist;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(2);
		stack.push(18);
		stack.push(25);
		stack.push(8);
		
		stack.traverse();
		
		System.out.println(" Poping :  "+stack.pop());
		stack.traverse();
	}

}

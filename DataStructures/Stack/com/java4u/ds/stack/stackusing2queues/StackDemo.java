package com.java4u.ds.stack.stackusing2queues;

public class StackDemo {

	public static void main(String[] args) {
		
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		stack.push(2);
		stack.push(18);
		stack.push(25);
		stack.push(8);
		
		stack.traverse();
		
		System.out.println(" Poping :  "+stack.pop());
		stack.traverse();
	}

}

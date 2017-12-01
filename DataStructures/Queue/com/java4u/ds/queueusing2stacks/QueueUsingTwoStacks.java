package com.java4u.ds.queueusing2stacks;

import java.util.Stack;

public class QueueUsingTwoStacks {

	private Stack stackOne = new Stack();
	private Stack stackTwo = new Stack();

	public void enQueue(int data) {
		stackOne.push(data);
	}

	public boolean isEmpty() {
		return stackOne.isEmpty() && stackTwo.isEmpty();
	}

	public int getSize() {
		return stackOne.size() + stackTwo.size();
	}

	public int deQueue() {
		if (!stackTwo.isEmpty()) {
			return (int) stackTwo.pop();
		} else if (!stackOne.isEmpty()) {
			while (!stackOne.isEmpty()) {
				stackTwo.push(stackOne.pop());
				return (int) stackTwo.pop();
			}
		} else {
			System.out.println("Stack is Empty!!!");
		}
		return 0;
	}
}

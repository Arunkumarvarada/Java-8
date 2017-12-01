package com.java4u.ds.stack.reverse;

import com.java4u.ds.stackusinglist.Stack;

public class StackReverse {

	private Stack stack = null;
	private Stack auxillaryStack = new Stack();

	StackReverse(Stack stack) {
		this.stack = stack;
	}

	public void reverse() {
		if (stack.isEmpty()) {
			return;
		} else {
			int temp = (int) stack.pop();
			reverse();
			stack.push(temp);
		}
	}


	public Stack usingAuxilaryStack() {
		if (stack.isEmpty()) {
			return null;
		} else {
			auxillaryStack.push(stack.pop());
			usingAuxilaryStack();
		}
		return auxillaryStack;
	}
}

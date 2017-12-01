package com.java4u.ds.stack.reverse;

import com.java4u.ds.stackusinglist.Stack;

public class StackReverseDemo {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(23);
		stack.push(34);
		stack.push(45);
		stack.push(65);
		stack.push(12);
		stack.push(31);
		stack.push(43);
		stack.push(53);
		stack.push(41);
		stack.traverse();
		StackReverse stackReverse = new StackReverse(stack);
		Stack stack1 = stackReverse.usingAuxilaryStack();
		stack1.traverse();
	}

}

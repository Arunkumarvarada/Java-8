package com.java4u.ds.stack.sorter;

import com.java4u.ds.stackusinglist.Stack;

public class StackSorter {

	public Stack stackSorter(Stack source) {
		Stack dest = new Stack();
		while (!source.isEmpty()) {
			int temp = source.pop();
			while (!dest.isEmpty() && dest.peek() < temp) {
				int data=dest.pop();
				source.push(data);
			}
			dest.push(temp);
		}
		return dest;
	}
}

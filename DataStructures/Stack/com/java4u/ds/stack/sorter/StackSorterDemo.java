package com.java4u.ds.stack.sorter;

import com.java4u.ds.stackusinglist.Stack;

public class StackSorterDemo {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(23);
		stack.push(21);
		stack.push(34);
		stack.push(20);
		stack.push(45);
		
		stack.traverse();
		StackSorter  sorter= new StackSorter();
		Stack sdest=sorter.stackSorter(stack);
		
		sdest.traverse();
	}

}

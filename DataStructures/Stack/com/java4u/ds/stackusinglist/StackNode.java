package com.java4u.ds.stackusinglist;

public class StackNode {
	
	private int data;
	private StackNode next = null;

	public StackNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public StackNode getNext() {
		return next;
	}

	public void setNext(StackNode next) {
		this.next = next;
	}

}

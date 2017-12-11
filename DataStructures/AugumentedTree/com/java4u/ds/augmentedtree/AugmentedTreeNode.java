package com.java4u.ds.augmentedtree;

public class AugmentedTreeNode {
	private int data;
	private AugmentedTreeNode left;
	private AugmentedTreeNode right;
	private int size;

	public AugmentedTreeNode(int data) {
		this.data = data;
		this.size = 1;
		this.left = null;
		this.right = null;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public AugmentedTreeNode getLeft() {
		return left;
	}

	public void setLeft(AugmentedTreeNode left) {
		this.left = left;
	}

	public AugmentedTreeNode getRight() {
		return right;
	}

	public void setRight(AugmentedTreeNode right) {
		this.right = right;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

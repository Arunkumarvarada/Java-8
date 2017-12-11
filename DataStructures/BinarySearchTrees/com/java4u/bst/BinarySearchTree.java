package com.java4u.bst;

public class BinarySearchTree {
	private BSTNode root;

	public BinarySearchTree() {

	}

	public BSTNode getRootNode() {
		return root;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public int sumOfAllElements() {
		return sumOfAllElements(root);
	}

	private int sumOfAllElements(BSTNode root) {
		if (root == null) {
			return 0;
		}
		return (root.getData() + sumOfAllElements(root.getLeft()) + sumOfAllElements(root.getRight()));
	}

	public int maxElement() {
		return maxElement(root);
	}

	private int maxElement(BSTNode root) {
		if (root == null) {
			return 0;
		}
		return maxElement(root.getRight());
	}

	public int minElement() {
		return minElement(root);
	}

	private int minElement(BSTNode root) {
		if (root == null) {
			return 0;
		}
		return minElement(root.getLeft());
	}

}

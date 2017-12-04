package com.java4u.btree;

import java.util.LinkedList;

public class BinaryTree {
	private BTreeNode root = null;
	private int diameter = 0;

	public BinaryTree() {

	}

	public void insert(int data) {
		BTreeNode temp;
		BTreeNode newNode = new BTreeNode(data);
		newNode.setLeft(null);
		newNode.setRight(null);

		if (root == null) {
			root = newNode;
			return;
		}

		LinkedList<BTreeNode> queue = new LinkedList<BTreeNode>();
		queue.addLast(root);

		while (!queue.isEmpty()) {
			temp = queue.removeFirst();
			if (null != temp.getLeft()) {
				queue.addLast(temp.getLeft());
			} else {
				temp.setLeft(newNode);
				return;
			}
			if (null != temp.getRight()) {
				queue.addLast(temp.getRight());
			} else {
				temp.setRight(newNode);
				return;
			}
		}
	}

	public boolean isPresent(int data) {
		return isPresent(root, data);
	}

	private boolean isPresent(BTreeNode root2, int data) {
		boolean found = false;
		if (root == null) {
			return false;
		}
		if (root.getData() == data) {
			return true;
		}
		found = isPresent(root.getLeft(), data);
		if (found == true) {
			return true;
		}

		return isPresent(root.getRight(), data);

	}

	public void levelOrderTrversal() {
		BTreeNode temp = root;

		if (null == temp) {
			System.out.println("No Element in the Tree!!");
		}
		LinkedList<BTreeNode> queue = new LinkedList<BTreeNode>();

		queue.addLast(temp);
		while (!queue.isEmpty()) {
			temp = queue.removeFirst();
			System.out.print(" " + temp.getData());
			if (null != temp.getLeft()) {
				queue.add(temp.getLeft());
			}
			if (null != temp.getRight()) {
				queue.addLast(temp.getRight());
			}
		}
	}

	public void preOrderTrversal() {
		preOrderTraversal(root);
	}

	private void preOrderTraversal(BTreeNode root) {
		if (root == null) {
			return;
		} else {
			System.out.println(root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}

	public void postOrderTrversal() {
		postOrderTraversal(root);
	}

	private void postOrderTraversal(BTreeNode root) {
		if(root==null) {
			return;
		}
		else {
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.println(root.getData());
		}
		
	}
	
	public void inOrderTrversal() {
		inOrderTrversal(root);
	}

	private void inOrderTrversal(BTreeNode root) {
		if(root==null) {
			return;
		}
		else {
			postOrderTraversal(root.getLeft());
			System.out.println(root.getData());
			postOrderTraversal(root.getRight());
		}
		
	}

	public void levelOrderTrversalIterative() {

	}

	public void preOrderTrversalIterative() {

	}

	public void postOrderTrversalIterative() {

	}

	public int sumOfAllElements() {
		return diameter;
	}

	public boolean isEmpty() {
		return (root == null);
	}

	public BTreeNode getRootNode() {
		return root;
	}

}

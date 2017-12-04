package com.java4u.btree;

import java.util.LinkedList;
import java.util.Stack;

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

	public void levelOrderTraversal() {
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

	public void preOrderTraversal() {
		preOrderTraversal(root);
		System.out.println();
	}

	private void preOrderTraversal(BTreeNode root) {
		if (root == null) {
			return;
		} else {
			System.out.print(" " + root.getData());
			preOrderTraversal(root.getLeft());
			preOrderTraversal(root.getRight());
		}
	}

	public void postOrderTraversal() {
		postOrderTraversal(root);
		System.out.println();
	}

	private void postOrderTraversal(BTreeNode root) {
		if (root == null) {
			return;
		} else {
			postOrderTraversal(root.getLeft());
			postOrderTraversal(root.getRight());
			System.out.print(" " + root.getData());
		}

	}

	public void inOrderTraversal() {
		inOrderTrversal(root);
		System.out.println();
	}

	private void inOrderTrversal(BTreeNode root) {
		if (root == null) {
			return;
		} else {
			postOrderTraversal(root.getLeft());
			System.out.print(" " + root.getData());
			postOrderTraversal(root.getRight());
		}

	}

	public void inOrderTraversalIterative() {
		inOrderTrversalIterative(root);
		System.out.println();
	}

	private void inOrderTrversalIterative(BTreeNode root) {
		if (root == null) {
			return;
		}
		Stack<BTreeNode> stack = new Stack<BTreeNode>();
		while (true) {
			if (root != null) {
				stack.push(root);
				root = root.getLeft();
			}
			if (stack.isEmpty()) {
				break;
			}
			root = stack.pop();
			System.out.println(root.getData());
			root = root.getRight();
		}

	}

	public void preOrderTraversalIterative() {
		preOrderTrversalIterative(root);
		System.out.println();
	}

	private void preOrderTrversalIterative(BTreeNode root) {
		if (root == null) {
			return;
		}
		Stack<BTreeNode> stack = new Stack<>();
		while (!stack.isEmpty()) {
			if (root != null) {
				System.out.print(" " + root.getData());
				root = root.getLeft();
				if (root != null) {
					stack.push(root);
				}
			} else {
				root = stack.pop();
				root = root.getRight();
				if (root != null) {
					stack.push(root);
				}
			}
		}
	}

	public void postOrderTraversalIterative() {
		postOrderTrversalIterative(root);
		System.out.println();
	}

	private void postOrderTrversalIterative(BTreeNode root) {
		if (root == null) {
			return;
		}
		Stack<BTreeNode> stack = new Stack<BTreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			if (root != null) {
				root = root.getLeft();
				if (root != null) {
					stack.push(root);
				}
			} else {
				root = stack.pop();
				stack.push(root);
				root = root.getRight();
				System.out.print(" " + root.getData());
			}
		}

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

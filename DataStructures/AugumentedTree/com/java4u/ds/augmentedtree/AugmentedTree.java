package com.java4u.ds.augmentedtree;

public class AugmentedTree {
	private AugmentedTreeNode root;

	public void insert(int data) {
		root = insertNode(root, data);
	}

	private AugmentedTreeNode insertNode(AugmentedTreeNode root, int data) {
		if (null == root) {
			AugmentedTreeNode newNode = new AugmentedTreeNode(data);
			return newNode;
		} else {
			if (root.getData() < data) {
				root.setLeft(insertNode(root.getLeft(), data));
			} else {
				root.setRight(insertNode(root.getRight(), data));
			}
			root.setSize(size(root.getLeft()) + size(root.getRight()) + 1);
		}
		return root;
	}

	private int size(AugmentedTreeNode node) {
		if (node == null) {
			return 0;
		}
		return node.getSize();
	}

	public void delete(int data) {
		root = delete(root, data);
	}

	private AugmentedTreeNode delete(AugmentedTreeNode root, int data) {
		AugmentedTreeNode temp;
		if (null == root) {
			System.out.println("No Element Found!!");
		} else if (data < root.getData()) {
			root.setLeft(delete(root.getRight(), data));
		} else if (data > root.getData()) {
			root.setRight(delete(root.getLeft(), data));
		} else {
			if (root.getLeft() != null && root.getRight() != null) {
				temp = findmax(root.getLeft());
				root.setData(temp.getData());
				root.setLeft(delete(root.getLeft(), root.getData()));
			} else {
				temp = root;
				if (root.getLeft() == null) {
					root = root.getRight();
				} else if (root.getRight() == null) {
					root = root.getLeft();
				}
				temp = null;
			}
		}
		if (null != root) {
			root.setSize(size(root.getLeft()) + size(root.getRight()) + 1);
		}
		return root;
	}

	private AugmentedTreeNode findmax(AugmentedTreeNode root) {
		AugmentedTreeNode temp = root;
		while (temp.getRight() != null) {
			temp = temp.getRight();
		}
		return temp;
	}

	public void inOrder() {
		inOrder(root);
		System.out.println();
	}

	private void inOrder(AugmentedTreeNode root) {
		if (root == null) {
			return;
		}
		if (null != root) {
			inOrder(root.getLeft());
			System.out.print(" " + root.getData() + " " + root.getSize() + ";");
			inOrder(root.getRight());
		}
	}

	public void preOrder() {
		preOrder(root);
		System.out.println();
	}

	private void preOrder(AugmentedTreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(" " + root.getData() + " " + root.getSize() + ";");
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	public void postOrder() {
		postOrder(root);
		System.out.println();
	}

	private void postOrder(AugmentedTreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(" " + root.getData() + " " + root.getSize() + ";");
	}

	public int numNodes() {
		if (root == null) {
			return root.getSize();
		}
		return 0;
	}

	public int search(int k) {
		if (k > numNodes()) {
			System.out.println("Not so many elements");
			return 0;
		} else {
			return search(root, k).getData();
		}

	}

	private AugmentedTreeNode search(AugmentedTreeNode root, int k) {
		int r = size(root.getLeft()) + 1;
		if (k == r) {
			return root;
		} else if (k < r) {
			return search(root.getLeft(), k);
		} else {
			return search(root.getRight(), k);
		}
	}
	
}

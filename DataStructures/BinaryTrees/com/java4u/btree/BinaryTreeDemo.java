package com.java4u.btree;

public class BinaryTreeDemo {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(23);
		binaryTree.insert(34);
		binaryTree.insert(45);
		binaryTree.insert(54);
		binaryTree.insert(67);
		binaryTree.insert(84);
		binaryTree.insert(95);
		System.out.println("Level Order Traversal");
		binaryTree.levelOrderTraversal();
		System.out.println();
		System.out.println("Pre Order Traversal");
		binaryTree.preOrderTraversal();
		System.out.println();
		System.out.println("Post Order Traversal");
		binaryTree.postOrderTraversal();
		System.out.println();
		System.out.println("In Order Traversal");
		binaryTree.inOrderTraversal();
		
		System.out.println();
		System.out.println("***********Iterative Traversal******************");
		System.out.println("PreOrder Iterative");
		binaryTree.preOrderTraversalIterative();
		System.out.println("InOrder Iterative");
		binaryTree.inOrderTraversalIterative();
//		System.out.println("PostOrder Iterative");
//		binaryTree.postOrderTraversalIterative();
	}

}

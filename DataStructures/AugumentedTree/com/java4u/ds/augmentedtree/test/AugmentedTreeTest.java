package com.java4u.ds.augmentedtree.test;

import com.java4u.ds.augmentedtree.AugmentedTree;

public class AugmentedTreeTest {

	public static void main(String[] args) {
		AugmentedTree augTree = new AugmentedTree();
		augTree.insert(13);
		augTree.insert(2);
		augTree.insert(8);
		augTree.insert(10);
		augTree.insert(7);
		augTree.insert(15);
		augTree.insert(25);
		augTree.inOrder();
		augTree.preOrder();

		System.out.println("Third Node : " + augTree.search(3));
		System.out.println("Seventh Node : " + augTree.search(7));
		System.out.println("Fifth Node : " + augTree.search(5));
		System.out.println("Size at Root node  : " + augTree.numNodes());
		System.out.println("Tenth Node : " + augTree.search(10));

		System.out.println("Deleting 8 On Tree : ");
		augTree.delete(8);
		augTree.inOrder();
		System.out.println();

		System.out.println("Deleting 25 On Tree : ");
		augTree.delete(15);
		augTree.inOrder();
		System.out.println();

		AugmentedTree augmentedTree = new AugmentedTree();
		augmentedTree.insert(34);
		augmentedTree.insert(24);
		augmentedTree.insert(48);
		augmentedTree.inOrder();
		augmentedTree.preOrder();
		augmentedTree.postOrder();
		System.out.println("Size at Root Node : " + augmentedTree.numNodes());

	}

}

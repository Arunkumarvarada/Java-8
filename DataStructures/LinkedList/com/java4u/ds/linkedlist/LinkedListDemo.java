package com.java4u.ds.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		System.out.println("Is List is Empty :: " + list.isEmpty());
		list.delete(22);

		// Add the elements into list

		list.insertBefore(22);
		list.insertBefore(33);
		list.insertBefore(44);
		list.insertAtEnd(34);
		list.travese();
		list.reverseRecursive();
		list.travese();
		list.insert(1, 54);
		list.insert(0, 77);
		list.insert(7, 12);
		list.insert(5, 16);
		list.travese();
		list.deleteAtBeginning();
		list.deleteAtEnd();
		list.travese();
		//list.delete(6, 34);
		list.delete(34);
		list.delete(22);
		list.delete(44);
		list.delete(13);
		list.travese();
		list.printReverse();
		list.reverseRecursive();
		list.travese();
		System.out.println("The Size of Linked List is :: "+ list.getSize());
		Node node= list.getMiddle();
		System.out.println("Node data: "+ node.getData());

	}

}

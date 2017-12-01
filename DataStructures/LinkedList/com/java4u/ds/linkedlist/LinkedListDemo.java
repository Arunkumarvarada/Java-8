package com.java4u.ds.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		System.out.println("Is List is Empty :: " + list.isEmpty());
		list.deleteData(22);

		// Add the elements into list

		list.insertAtBeginning(22);
		list.insertAtBeginning(33);
		list.insertAtBeginning(44);
		list.insertAtBeginning(34);
		list.insertAtBeginning(45);
		Node node= list.getMiddle();
		System.out.println("Node data: "+ node.getData());
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
		list.deleteData(34);
		list.deleteData(22);
		list.deleteData(44);
		list.deleteData(13);
		list.travese();
		list.printReverse();
		list.reverseRecursive();
		list.travese();
		list.deleteBasedOnPosition(3);
		list.deleteBasedOnPosition(1);
		list.travese();
		System.out.println("The Size of Linked List is :: "+ list.getSize());
		node= list.getMiddle();
		System.out.println("Node data: "+ node.getData());

	}

}

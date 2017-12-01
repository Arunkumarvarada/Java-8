package com.java4u.ds.linkedlist.cycle;

import com.java4u.ds.linkedlist.LinkedList;
import com.java4u.ds.linkedlist.Node;

public class CycleDetectionDemo {

	public static void main(String[] args) {
		CycleDetection cycle = new CycleDetection();
		LinkedList llCycle = new LinkedList();
		Node tempStart = null;
		Node temp = null;
		Node tempEnd = null;
		for (int i = 0; i < 15; i++) {
			temp = llCycle.insertWithReturn(i);
			if (4 == i) {
				tempStart = temp;
			}

		}
		tempEnd = temp;
		tempEnd.setNext(tempStart);
		System.out.println("Has Cycle for Second List : " + cycle.hasCycle(tempStart));

	}

}

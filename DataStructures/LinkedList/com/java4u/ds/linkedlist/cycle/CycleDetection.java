package com.java4u.ds.linkedlist.cycle;

import com.java4u.ds.linkedlist.Node;

public class CycleDetection {
	private Node head = null;

	public boolean hasCycle(Node head) {
		if (null == head) {
			return false;
		} else {
			Node slow, fast;
			fast = slow = head;
			while (fast != null && fast.getNext() != null) {
				slow = slow.getNext();
				fast = fast.getNext().getNext();
				if (slow == fast) {
					return true;
				}
			}
			if (null == fast || null == fast.getNext()) {
				return false;
			}
		}
		return false;
	}
}

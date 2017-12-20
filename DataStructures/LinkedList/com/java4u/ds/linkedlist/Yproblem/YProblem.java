package com.java4u.ds.linkedlist.Yproblem;

import java.util.HashSet;

import com.java4u.ds.linkedlist.Node;

public class YProblem {

	public boolean solveYProblem(Node list1, Node list2) {
		boolean isIntersectionFound = false;
		HashSet<Integer> set = new HashSet<>();
		while (list1 != null) {
			set.add(list1.getData());
			list1 = list1.getNext();
		}
		while (list2 != null) {
			if (set.contains(list2.getData())) {
				isIntersectionFound = true;
				return isIntersectionFound;
			} else {
				set.add(list2.getData());
			}
		}
		return isIntersectionFound;
	}

	public static void main(String[] args) {

	}

}

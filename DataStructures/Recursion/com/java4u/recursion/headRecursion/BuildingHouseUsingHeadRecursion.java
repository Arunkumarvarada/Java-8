package com.java4u.recursion.headRecursion;

public class BuildingHouseUsingHeadRecursion {
	public static void main(String[] args) {
		buildLayer(4);
	}

	private static void buildLayer(int height) {
		if (height == 0) {
			return;
		}
		buildLayer(height - 1);
		System.out.println(height);
	}
}

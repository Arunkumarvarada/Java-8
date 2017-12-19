package com.java4u.recursion.tailRecursion;

public class BuildingHouseUsingTailRecursion {

	public static void main(String[] args) {
		buildLayer(4);
	}

	private static void buildLayer(int height) {
		if (height == 0) {
			return;
		}
		System.out.println(height);
		buildLayer(height - 1);
	}
}

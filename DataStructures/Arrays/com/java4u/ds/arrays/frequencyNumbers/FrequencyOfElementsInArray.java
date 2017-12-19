package com.java4u.ds.arrays.frequencyNumbers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyOfElementsInArray {

	public static HashMap<Integer, Integer> frequencyOfElements(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int a : arr) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}
		return map;
	}

	public static void printMap(Map<Integer, Integer> map) {
		Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 2, 4, 5, -1, 6, 4 };
		Map<Integer, Integer> frequencyMap = frequencyOfElements(arr);
		System.out.println("Frequency of elements :");
		printMap(frequencyMap);
	}

}

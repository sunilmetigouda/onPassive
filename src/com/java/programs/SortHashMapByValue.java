package com.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortHashMapByValue {
	HashMap<String, Integer> map;
	LinkedHashMap<String, Integer> linkedMap;
	ArrayList<Map.Entry<String, Integer>> arr;

	public void sort() {
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			arr.add(e);
		}

		Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
				Integer v1 = e1.getValue();
				Integer v2 = e2.getValue();
				return v1.compareTo(v2);
			}
		};

		Collections.sort(arr, valueComparator);

		for (Map.Entry<String, Integer> e : arr) {
			linkedMap.put(e.getKey(), e.getValue());
			System.out.println(e.getValue());
		}
	}

	SortHashMapByValue() {
		map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 30);
		map.put("c", 20);
		map.put("d", 5);
		map.put("e", 40);

		linkedMap = new LinkedHashMap<>();
		arr = new ArrayList<>();
	}

	public static void main(String[] args) {
		SortHashMapByValue m = new SortHashMapByValue();
		m.sort();
	}
}

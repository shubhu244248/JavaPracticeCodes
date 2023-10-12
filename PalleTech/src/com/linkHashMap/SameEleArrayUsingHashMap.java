package com.linkHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class SameEleArrayUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int[] arr2 = { 5, 10, 15, 20, 40 };
		LinkedHashMap<Integer, Integer> mymap1 = new LinkedHashMap<Integer, Integer>();
		LinkedHashMap<Integer, Integer> mymap2 = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (mymap1.containsKey(arr1[i]) == true) {
				int value = mymap1.get(arr1[i]);
				mymap1.put(arr1[i], value + 1);
			} else {
				mymap1.put(arr1[i], 1);
			}

		}
		for (int i = 0; i < arr2.length; i++) {
			if (mymap2.containsKey(arr2[i]) == true) {
				int value = mymap2.get(arr2[i]);
				mymap2.put(arr2[i], value + 1);
			} else {
				mymap2.put(arr2[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : mymap1.entrySet()) {
			if (mymap2.containsKey(entry.getKey()) == true) {
				System.out.print(entry.getKey() + ", ");
			}
		}
	}
}

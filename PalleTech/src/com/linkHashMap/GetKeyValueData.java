package com.linkHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class GetKeyValueData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character, Integer> mymap = new LinkedHashMap<Character, Integer> ();
		
		mymap.put('a', 65);
		mymap.put('b', 66);
		mymap.put('c', 67);
		
		for(Map.Entry<Character, Integer> entry : mymap.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
	}

}

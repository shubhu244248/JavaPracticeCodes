package com.linkHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCharDuplivateOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababcaacde";
		LinkedHashMap<Character, Integer> mymap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i <= str.length() - 1; i++) {
			if (mymap.containsKey(str.charAt(i)) == true) {
				int value = mymap.get(str.charAt(i));
				mymap.put(str.charAt(i), value + 1);

			} else {
				mymap.put(str.charAt(i), 1);
			}
		}

		String temp = "";
		for (Map.Entry<Character, Integer> entry : mymap.entrySet()) {

//			temp = temp + entry.getKey();
//			temp = temp + entry.getValue();
			if(entry.getValue() != 1) {
				System.out.print(entry.getKey()+" "+entry.getValue());
			}
		}
	}

}

package com.linkHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ababcaabc";
		LinkedHashMap< Character, Integer> mymap = new LinkedHashMap< Character, Integer>();
		for(int i = 0; i <= str.length()-1; i++ ) {
			if(mymap.containsKey(str.charAt(i)) == true) {
				int value = mymap.get(str.charAt(i));
				mymap.put(str.charAt(i), value+1);
			
			} else {
				mymap.put(str.charAt(i), 1);
			}
		}
		
		System.out.println(mymap);
		
		String temp ="";
		for(Map.Entry<Character, Integer> entry : mymap.entrySet()) {
			System.out.print(entry.getKey() +" "+ entry.getValue()+"\t");
//			temp = temp + entry.getKey();
//			temp = temp + entry.getValue();
		}
//		System.out.println(temp);
	}

}

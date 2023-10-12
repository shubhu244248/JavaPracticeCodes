package com.linkHashMap;
import java.util.*;
public class TwoStringCommonChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Palle";
		String str2 = "pjava";

		HashSet<Character> set1 = new HashSet<>();
		HashSet<Character> common = new HashSet<>();

		for (int i = 0; i < str1.length(); i++) {
			set1.add(str1.charAt(i));
		}

		for (int i = 0; i < str2.length(); i++) {
			if (set1.contains(str2.charAt(i))) {
				common.add(str2.charAt(i));
			}
		}

		for (char c : common) {
			System.out.print(c);

		}

	}

}

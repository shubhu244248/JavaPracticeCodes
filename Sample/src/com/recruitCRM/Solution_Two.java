package com.recruitCRM;

import java.util.Scanner;

public class Solution_Two {
	public static String modifyString(String inputString) {
		StringBuilder modified = new StringBuilder();

		for (char c : inputString.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				c = (char) ('a' + (c - 'a' + 1) % 26);
				if ("aeiou".indexOf(c) != -1) {
					c = Character.toUpperCase(c);
				}
			}
			modified.append(c);
		}

		return modified.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		String result = modifyString(inputString);
		System.out.println(result);
	}

}

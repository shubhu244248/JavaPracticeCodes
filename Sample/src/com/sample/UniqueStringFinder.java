package com.sample;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueStringFinder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // read the number of strings

		// read the strings into an array
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			strings[i] = scanner.next();
		}

		// iterate over the strings and find the first one that contains only unique
		// characters
		for (String s : strings) {
			if (containsOnlyUniqueChars(s)) {
				System.out.println(s);
				return;
			}
		}

		System.out.println("No unique string found.");
	}

	private static boolean containsOnlyUniqueChars(String s) {
		HashSet<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (set.contains(c)) {
				return false;
			}
			set.add(c);
		}
		return true;
	}
}

package com.codeVita;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Orchard {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		Map<String, Integer> countsA = getCounts(str1);
		Map<String, Integer> countsB = getCounts(str2);

		int num_c = countsA.size();
		int num_d = countsB.size();

		if (num_c == 0 && num_d == 0)
			System.out.print("Invalid input");
		else if (num_c > num_d)
			System.out.print("Anand");
		else if (num_d > num_c)
			System.out.print("Ashok");
		else
			System.out.print("Draw");
	}

	static Map<String, Integer> getCounts(String str) {
		Map<String, Integer> counts = new HashMap<>();
		for (int i = 0; i < str.length() - 1; i++) {
			String pair = str.substring(i, i + 2);
			counts.put(pair, counts.getOrDefault(pair, 0) + 1);
		}
		return counts;
	}
}

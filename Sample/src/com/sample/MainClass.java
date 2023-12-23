package com.sample;

import java.util.Scanner;

public class MainClass {
	static final int MOD = 1000000007;

	static int countDistinctSubstrings(String s) {
		int n = s.length();
		int[] dp = new int[n];
		dp[0] = 1;

		for (int i = 1; i < n; i++) {
			dp[i] = (2 * dp[i - 1]) % MOD;
			for (int j = i - 2; j >= 0; j--) {
				if (s.charAt(i) != s.charAt(j)) {
					break;
				}
				dp[i] = (dp[i] - dp[j] + MOD) % MOD;
			}
		}

		int result = 0;
		for (int value : dp) {
			result = (result + value) % MOD;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		System.out.println(countDistinctSubstrings(s));
	}

}

package com.sample;

public class SequnceNum {
	public static long getSequenceSum(int i, int j, int k) {
		long total = 0;
		
		if (i <= j) {
			for (int num = i; num <= j; num++) {
				total += num;
			}
		} else {
			for (int num = i; num >= j; num--) {
				total += num;
			}
		}

		if (j <= k) {
			for (int num = j + 1; num <= k; num++) {
				total += num;
			}
		} else {
			for (int num = j - 1; num >= k; num--) {
				total += num;
			}
		}

		return total;
	}

	public static void main(String[] args) {
		System.out.println(getSequenceSum(5, 9, 6)); // Output: 56
		System.out.println(getSequenceSum(0, -5, 1)); // Output: 24
		System.out.println(getSequenceSum(-5, -1, -3)); // Output: -20
	}

}

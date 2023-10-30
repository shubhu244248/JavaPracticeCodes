package com.delloite;

import java.util.ArrayList;
import java.util.Scanner;

public class Code1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList <String> res = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			int number = scanner.nextInt();
			String numberStr = String.valueOf(number);
			boolean isHealthy = true;

			for (int j = 1; j < numberStr.length(); j++) {
				if (numberStr.charAt(j) < numberStr.charAt(j - 1)) {
					isHealthy = false;
					break;
				}
			}

			res.add(isHealthy ? "Healthy" : "Unhealthy");
		}

		for (String result : res) {
			System.out.println(result);
		}
	}
}

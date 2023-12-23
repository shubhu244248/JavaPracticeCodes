package com.sample;

import java.util.*;

public class HelloWorld {

	public static List<String> getLatestKRequests(String[] requests, int k) {
		List<String> finalItems = new ArrayList<>();
		Set<String> uniqueItems = new LinkedHashSet<>();

		for (int i = requests.length - 1; i >= 0 && finalItems.size() < k; i--) {
			if (uniqueItems.add(requests[i])) {
				finalItems.add(requests[i]);
			}
		}

		return finalItems;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		String[] itmArr = new String[n];
		for (int i = 0; i < n; i++) {
			itmArr[i] = sc.nextLine();
		}

		int k = sc.nextInt();
		
		List<String> lastReq = getLatestKRequests(itmArr, k);
		Collections.reverse(lastReq);
		for (String req : lastReq) {
			System.out.println(req);
		}
	}
}

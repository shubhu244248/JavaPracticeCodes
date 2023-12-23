package com.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = 3;

		List<List<Integer>> adjList = new ArrayList<>();
		for (int i = 0; i <= n; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int i = 0; i < m; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			adjList.get(a).add(b);
			adjList.get(b).add(a);
		}

		List<Integer> result = findLexicographicallySmallestSequence(n, adjList);
		for (int node : result) {
			System.out.println(node);
		}
	}

	static List<Integer> findLexicographicallySmallestSequence(int n, List<List<Integer>> adjList) {
		boolean[] visited = new boolean[n + 1];
		List<Integer> result = new ArrayList<>();

		dfs(1, adjList, visited, result);

		return result;
	}

	static void dfs(int node, List<List<Integer>> adjList, boolean[] visited, List<Integer> result) {
		visited[node] = true;
		result.add(node);

		for (int neighbor : adjList.get(node)) {
			if (!visited[neighbor]) {
				dfs(neighbor, adjList, visited, result);
			}
		}
	}
}

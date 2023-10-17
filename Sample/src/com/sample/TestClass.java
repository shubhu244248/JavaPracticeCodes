package com.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            int[][] A = new int[N][2];
            
            for (int i = 0; i < N; i++) {
                String[] arr = br.readLine().split(" ");
                A[i][0] = Integer.parseInt(arr[0]);
                A[i][1] = Integer.parseInt(arr[1]);
            }
            
            int K = Integer.parseInt(br.readLine().trim());
            long out = solve(N, A, K);
            System.out.println(out);
        }
        
        wr.close();
        br.close();
    }
    
    public static long solve(int N, int[][] A, int K) {
        long result = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int distance = (A[i][0] ^ A[j][0]) + (A[i][1] ^ A[j][1]);
                if (distance == K) {
                    result++;
                }
            }
        }
        
        return result;
    }
}

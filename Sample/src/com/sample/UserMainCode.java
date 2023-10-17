package com.sample;

import java.io.*;
import java.util.*;

// Read only region start 
class UserMainCode{
    public int difference(String input1){
        // Read only region end
        // write code here...
        int n = input1.length();
        int longestLength = 1;
        int shortestLength = n;
        
        // Find longest palindromic substring
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n-len; i++) {
                int j = i + len - 1;
                if (input1.charAt(i) == input1.charAt(j)) {
                    if (len == 2) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                    if (dp[i][j] && len > longestLength) {
                        longestLength = len;
                    }
                }
            }
        }
        
        // Find shortest palindromic substring
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                String substr = input1.substring(i, j);
                if (isPalindromic(substr)) {
                    int len = substr.length();
                    if (len < shortestLength) {
                        shortestLength = len;
                    }
                }
            }
        }
        
        return longestLength - shortestLength;
    }
    
    public boolean isPalindromic(String s) {
        int n = s.length();
        for (int i = 0; i < n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
}


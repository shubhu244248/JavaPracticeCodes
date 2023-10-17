package com.sample;

//import java.util.Scanner;
//
//public class SampleGOD{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt(); // number of test cases
//
//        while (t > 0) {
//            int n = scanner.nextInt(); // length of string S
//            String s = scanner.next(); // string S
//
//            int count = 0; // count of '+' characters to be inserted
//            int open = 0; // count of open brackets
//
//            for (int i = 0; i < n; i++) {
//                char c = s.charAt(i);
//                if (c == '(') {
//                    open++; // increment open bracket count
//                } else if (c == ')') {
//                    if (open > 0) {
//                        open--; // decrement open bracket count
//                    } else {
//                        count++; // increment '+' count
//                    }
//                }
//            }
//
//            System.out.println(count);
//            t--;
//        }
//    }
//}


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SampleGOD {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s = br.readLine();
            int n = s.length();
            int nby2 = n / 2;
            int open_count = 0;

            for (int i = 0; i < nby2; i++) {
                if (s.charAt(i) == '(')
                    open_count++;
            }

            System.out.println(open_count * 2);
        }
    }
}

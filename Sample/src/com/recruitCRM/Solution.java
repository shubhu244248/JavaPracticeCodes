package com.recruitCRM;


import java.util.Scanner;
public class Solution {
	
	public static float calculate_sellingprice(int cost_price, int no_of_item, int profit) {
		float sell_price = cost_price + (cost_price * profit / 100.0f);
        return sell_price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int cost_price = sc.nextInt();
        int no_of_item = sc.nextInt();
        int profit = sc.nextInt();
        float  sellingPrice = calculate_sellingprice(cost_price, no_of_item, profit);
        System.out.println(sellingPrice);
	}
}

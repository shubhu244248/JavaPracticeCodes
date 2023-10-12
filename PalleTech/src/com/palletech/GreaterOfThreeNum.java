package com.palletech;

import java.util.*;

public class GreaterOfThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if( num1 == num2 && num2 == num3 && num1 == num3) {
			System.out.println("All are same");
		} else if (num1 > num2 && num1 > num3){
			System.out.println("Num1 is gretter than other");
		}else if (num2 > num3){				//else if (num2 > num1 && num2 > num3){
			System.out.println("Num2 is gretter than other");
		}else if (num3 > num1 && num3 > num2){
			System.out.println("Num3 is gretter than other");
		}
	}

}

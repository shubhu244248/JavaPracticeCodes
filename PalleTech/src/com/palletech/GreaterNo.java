package com.palletech;

import java.util.Scanner;

public class GreaterNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Num1 : ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("Both are same");
		} else if(num1 > num2) {
			System.out.println("Num1 " +num1+" is greater than Num2 "+num2+".");
		} else {
			System.out.println("Num2 " +num2+" is greter than Num1 "+num1+".");
		}
		
		
		System.out.println((num1 == num2) ? "Both Same" : (num1 > num2) ? "Num1 is gretter it is " + num1 : "Num2 is gretter it is "+num2);
	}

}

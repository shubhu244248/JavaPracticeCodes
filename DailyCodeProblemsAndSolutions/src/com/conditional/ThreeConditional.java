package com.conditional;

public class ThreeConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		int num1 = 6;
		int num2 = 2;

		if (num == 1) {
			int squareOrCude = 2;
			switch (squareOrCude) {
			case 1:
				System.out.println(num1 * num1);
				break;
			case 2:
				System.out.println(num1 * num1 * num1);
				break;
			}
		} else {
			int operation = 4;
			switch (operation) {
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 - num2);
				break;
			case 3:
				System.out.println(num1 * num2);
				break;
			case 4:
				System.out.println((float) num1 / (float) num2);
				break;
			}
		}
	}

}

//Write a program to find out the as per given input 
//
//if user enter only single number then it will be find out the square or cube as per input(1 for suqare and 2 for cube)
//if user enter 2 numbers then it will be find out the addition, substraction, multiplication or division (
//		1 for addition, 2 for substraction, 3 for multiplication and 4 for division)
//
//Test cases :			Explanation
//	2        			How many number you are given from user
//	4 5					User input numbers 
//	1					(1 for addition, 2 for substraction, 3 for multiplication and 4 for division)
//	9
//
//Test cases :
//	1					How many number you are given from user
//	5					User input numbers 
//	1					(1 for suqare and 2 for cube)
//	25

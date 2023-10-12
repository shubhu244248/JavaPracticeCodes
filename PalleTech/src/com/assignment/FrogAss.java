package com.assignment;

public class FrogAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stairs = 30;
		int count = 1;
		
		for(int i = 1; i <= stairs ; i += 3) {
//			System.out.println("Three");
//			System.out.println("Two Down");
//			i = i + 3;
			i = i - 2;
//			System.out.println(i);
			count ++;
			if(count == stairs - 2) {
				break;
			}
		}
		
		System.out.println(count);
	}
}

//Write a program
//Starting from given input number upto (number + 100)
//
//input1
//4
//
//Output1 :
//4 5 6 7 8 9 . . . . . 104
//
//input2 :
//104
//
//Output1 :
//104 105 106 107 108 109 ..... 204

//
//1 to 100
//100 to 1 
//
//
//0 to 100
//100 to 0
//
// 1 3 5 7 9 ..... Odd upto 100
// 0 1 3 5 7 9....... odd
// 
// Same even 
// 
// same reverse
// 



















package com.conditional;

public class OneConditinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that to find out the is it triangle or not.
//		If it is triangle then define which triangle it is 
//		isosceles, equilateral and scalene triangle.
//		
//		Input criteria : You have to input the angle (means angle between
//		two side of triangle)
//		
//		Test your code with possible test cases think about beyond the problem
//		when it will be going wrong.
		
		int angle1 = 75;
		int angle2 = 75;
		int angle3 = 30;
		
		if(angle1 + angle2 + angle3 == 180) {
			System.out.println("It is triangle");
			if(angle1 == angle2 && angle2 == angle3) {
				System.out.println("It is equlateral triangle");
			}else if(angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
				System.out.println("It is scalene triangle");
			} else {
				System.out.println("It is isosceles triangle");
			}
		} else {
			System.out.println("it is not triangle");
		}
	}

}

package com.sample;

import java.util.*;

public class StdInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of student you want to submit");
		int noOfStd = sc.nextInt();
		sc.nextLine(); // consume the newline character left over from nextInt()

		for (int i = 0; i <= noOfStd; i++) {

			System.out.print("Enter student name: ");
			String name = sc.nextLine();

			System.out.print("Enter student Roll No : ");
			int rollNo = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter student Class : ");
			String clas = sc.nextLine();

			System.out.print("Enter student age : ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("Enter student address : ");
			String add = sc.nextLine();

			System.out.println("\nName: " + name);
			System.out.println("Age : " + rollNo);
			System.out.println("Class : " + clas);
			System.out.println("Years of experience: " + age);
			System.out.println("State: " + add);

			System.out.println("\n\n");
		}
	}

}

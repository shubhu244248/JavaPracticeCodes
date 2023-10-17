package com.sample;

import java.util.*;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	    System.out.print("No. of std :");
	    int n = s.nextInt();
	      for(int i=0 ; i<n ; i++)
	      {
	        System.out.print("\nstd Name:");
	        String name = s.next();

	        System.out.print("std RollNo:");
	        int rollno = s.nextInt();

	        System.out.print("Class:");
	        String c = s.next();
	        s.nextLine();

	        System.out.print("std Age:");
	        int age = s.nextInt();

	        System.out.print("std Address:");
	        String add = s.next();
	        s.nextLine();
	      
	        System.out.println("\nstd Name:"+name);
	        System.out.println("std RollNo:"+rollno);
	        System.out.println("Class:"+c);
	        System.out.println("std Age:"+age);
	        System.out.println("std Address:"+add);
	      }
	}

}

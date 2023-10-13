package com.string;

public class StringTokenJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	        Scanner scan = new Scanner(System.in);
//	        String s = scan.nextLine();
		String s = "He is a very very good boy, isn't he?";
		// Write your code here.
		s=s.trim();
		if (s.equals("")) {
			System.out.println(s.length());
		} else {
			String str[] = s.split("[ !,?._'@]+");
			System.out.println(str.length);
			for (String s1 : str) {
				System.out.println(s1);
			}
		}

//	        scan.close();
	}

}

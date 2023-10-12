package com.palletech;

public class EvenNoSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <=100; i++) {
//			System.out.println(i);
//			i++;
			if(i % 7 ==0 && i % 3 ==0) {
				break;
			}
			System.out.println(i);
		}
		
//		for(int i = 0; i <=100; i++ ) {
//			
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
	}

}

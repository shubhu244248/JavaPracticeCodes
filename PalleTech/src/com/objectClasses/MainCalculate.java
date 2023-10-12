package com.objectClasses;

public class MainCalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition ad = new Addition();
		System.out.println("Addition is "+(ad.a + ad.b));
		System.out.println(ad.add);
		
		Substraction sb = new Substraction();
		System.out.println("Substraction is "+(sb.a - sb.b));
		System.out.println(sb.sub);
		
		Multiplication ml = new Multiplication();
		System.out.println("Multiplication is "+(ml.a * ml.b));
		System.out.println(ml.mul);
		
		Division dv = new Division();
		System.out.println("Division is "+ ((dv.a % dv.b)));
		System.out.println(dv.div);
	}

}

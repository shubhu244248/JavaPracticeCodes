package com.datatypes;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Date;

import javax.swing.JSpinner.DateEditor;

public class DataTypeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A person is visit a bank and the bank manager says to he to submit
//		personal details in form. The bank having their won format of form
//		The manager ask he to submit the form and deposite some amount.
//		The form consist the details like Name, Birth Date, Age (in months) Address,
//		Adhar Card No, PAN Card No,Male or Female (M/F), Are You Married (True, False),
//		Are You Employe(Yes/No), Ammount Deposite. But the bank giving the reward of 
//		2000 account opening. So how much amount in the person bank account.
//		Try to test with your own Data
//		
//		
//		Test 1:
//			John Patil
//			13/12/2006
//			25
//			Delhi, India
//			2555 5455 5646
//			IB52658E
//			M
//			True
//			Yes
//			45500.00
//			
//		Output 1
//			Name : John Patil
//			Birth Date : 12/12/2006
//			Age : 25
//			Add : Delhi, India
//			Adhar No : 2555 5455 5646
//			PAN NO : IB52658E
//			Male / Female : M
//			Married : True
//			Are You Employe : Yes
//			Account balance : 47500.00
		
		Scanner sc = new Scanner(System.in);
		String Name = sc.nextLine();
		sc.nextLine();
		String inputDate = sc.nextLine();
		sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);
        String dt = date.format(formatter);
        sc.next();
        int age = sc.nextInt();
        sc.nextLine();
        String add = sc.nextLine();
        sc.nextLine();
        String adhar = sc.nextLine();
        sc.nextLine();
        char ch = sc.next().charAt(0);
        sc.nextLine();
        boolean bl = sc.nextBoolean();
        sc.nextLine();
        String marry = sc.nextLine();
        sc.next();
        float amount = sc.nextFloat();
        
        
          
        System.out.println(Name);
        System.out.println(dt);
        System.out.println(age);
        System.out.println(add);
        System.out.println(adhar);
        System.out.println(ch);
        System.out.println(bl);
        System.out.println(marry);
        System.out.println(amount + 2000);
	}

}

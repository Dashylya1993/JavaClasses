package com.syntax.class05;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner (System.in);
//		
//		System.out.println("Please write a long text");
//		String text1 = myScanner.next();
//		System.out.println(text1);
//		
//		String text2 = myScanner.next();
//		System.out.println(text2);
//		
//		String text3 = myScanner.nextLine();
//		System.out.println(text3);
		
		System.out.println("Please enter Dasha's age (int)!");
		int num = myScanner.nextInt();
		System.out.println(num);
		
		System.out.println("Please enter Dasha's age (double)!");
		double d = myScanner.nextDouble();
		System.out.println(d);
		
		System.out.println("Please enter if Dasha's Happy (true/false)!");
		boolean b = myScanner.nextBoolean();
		System.out.println(b);
		
		System.out.println("Please enter Dasha's name!");
		char myChar = myScanner.next().charAt(0);
		System.out.println(myChar);
		
		//String word = myScanner.next();
		//System.out.println(word);
	
		//int num = myScanner.nextInt();
		//double d = myScanner.nextDouble();
		//boolean b = myScanner.nextBoolean();
		//char myChar = myScanner.next().charAt(0);
	}

}

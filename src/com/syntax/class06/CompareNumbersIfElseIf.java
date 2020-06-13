package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();
		
		System.out.println("Please enter the second number:");
		double b = scan.nextDouble();
		
		System.out.println("Please enter the third number:");
		double c = scan.nextDouble();
		
		
//		double largest = 0;
		//1st way
//		double largest = 0;
//
//		if (a > b && a > c) {
//			largest = a;
//		} else if (b > a && b > c) {
//			largest = b;
//		} else if (c > a && c > b) {
//			largest = c;
//		}
//		
		
		//Castro way
		
		double largest;
		
		if (a > b && a > c) {
			//a is the largest
			largest = a;
		} else if (b > c) {//a is not the largest, I am comparing b and c
			//b is the largest
				largest = b;
		}else {//a is not the largest, b is not the largest.
			//c is the largest
			largest = c;
		}
				
		System.out.println("Largest number is " + largest);

//		double a = 5, b = 9, c = 1;
//
//		if (a > b && a > c) {
//			System.out.println("Largest number is " + a);
//		} else if (b > a && b > c) {
//			System.out.println("Largest number is " + b);
//		} else if (c > a && c > b) {
//			System.out.println("Largest number is " + c);
//		}

		
		
//		double a = 5, b = 9, c = 1;
//		double largest;
//		
//		if(a > b && a > c) {
//			largest = a;
//		}else if(b > a && b > c){
//			largest = b;
//		}else if(c > a && c > b){
//			largest = c;
//		}
//		
//		System.out.println("Largest number is " + largest);

	}

}

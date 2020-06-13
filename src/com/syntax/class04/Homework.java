package com.syntax.class04;

public class Homework {
	public static void main(String[] args) {
		
		// Write a program to check whether number is positive or negative.
		int num = 0;
		
		//1st way
		if (num > 0) {
			System.out.println("Number is positive");
		}else if (num < 0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is zero!");
			
		}

		//2nd way, both ways are acceptable
		if (num > 0) {
			System.out.println("Number is positive");
		}else if (num < 0) {
			System.out.println("Number is zero");
		}else {
			System.out.println("Number is negative!");
			}
		
		//task-3: Check whether number is Even or Odd.
		int num3 = 67;
		int remaider = num3 % 2;
		
		if (remaider == 0) {
		System.out.println(num3 + " is even!");
		}else {
			System.out.println(num3 + " is odd!");
		}
		
		//short way
		int num4 = 0;
		
		if (num4 % 2 == 0) {
		System.out.println(num4 + " is even!");
		}else {
			System.out.println(num4 + " is odd!");
		}
		
	}

}

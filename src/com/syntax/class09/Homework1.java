package com.syntax.class09;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		//Write a program that reads a range of integers (start and end point),
		//provided by a user and then from that range
		//print the sum of the even and odd integers.
		//print also the sum of all the total
		
		Scanner scan = new Scanner(System.in);
		int start; // I don't need to initialize because I will read from input
		int end;
		int sunOdd = 0;
		int sumEven = 0;
		int total = 0;
		
		System.out.println("Please enter a starting number: ");
		start = scan.nextInt();
		
		System.out.println("Please enter a ending number: ");
		end = scan.nextInt();
		
		for(int i = start; i <= end; i++) {
			if(i % 2 == 0) {// even number
				sumEven += i;
			}else { // odd number
				sunOdd += i;
			}
			//1st way 
			//total += i;
		
		}

		System.out.println("Sum of even numbers is " + sumEven);
		System.out.println("Sum of odd numbers is " + sunOdd);
		
		//2nd way
		total = sumEven + sunOdd;
		System.out.println("Sum of all numbers is " + total);
		}

	}	
		

package com.syntax.class03;

public class IfCondition {
	public static void main(String[] args) {
		
		//Declare a number a compare if the number is larder than 100
		//If it is larger than 100, I will print --> My number is large
		
		int num = 178;
		boolean result = num > 100;
		
		System.out.println("Let us check");
		if (num > 100) {
			System.out.println("My number is large");
		}else {
			System.out.println("My number is small");
			
		}
		
		System.out.println("The check is comlete ");
		
		//boolean result = num > 100;
		//if (result) {System.out.println("The result is true");
		//}
		
	System.out.println("-------------------------------------");
		
		int expectedHours = 15;
		int actualHours = 20;
		
		if (actualHours >= expectedHours) {
			System.out.println("You will love Java ");
		}else {
			System.out.println("You will NOT love Java");
		}
		
		System.out.println("-------------------------------------");
		
		double budget = 10000;
		double carPrice = 15000;
		
		if (budget > carPrice ) {// I will buy only if I have more money
			System.out.println("I will buy this car");
			System.out.println("I am happy");
		}else {//otherwise
			System.out.println("I will not buy this car");
			System.out.println("I will study Java");
			System.out.println("I will find a job");
			System.out.println("Then I will have money");
		}
		
		//Create a Java program and name it Double Comparison. 
		//Declare 2 double values and if value of first variable is higher then the second, 
		//print "Double value __ is larger than __ ." Otherwise print...
		
		//Create a Java program and name it Temperature Check. 
		//Create variable to store temperature. Your program should check 
		//if temperature is below 32 then it should print 
		//"Water will freeze with temperature __", otherwise "Water will NOT freeze with temperature __".
		
		
		
		
	}

}

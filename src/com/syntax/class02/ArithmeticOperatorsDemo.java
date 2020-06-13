package com.syntax.class02;

public class ArithmeticOperatorsDemo {
	//You can do Arithmetic operations on number, int, short, byte, double, float
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		
		int sub = num1 - num2;
		
		int div = num1/num2;
		
		int muil = num1*num2;
		
		
		System.out.println("addition ->" + sum);
		System.out.println("substraction ->" + sub);
		System.out.println("division ->" + div);
		System.out.println("multiplication ->" + muil);
		
		double d1 = 3.4;
		double d2 = 5.73;
		double dSum = d1+d2;
		System.out.println("double aditition ->" + dSum) ;
		
		
		// you can store an integer as double
		double dSum2 = num1 + num2;
        System.out.println("dSum2 ->" + dSum2);
        
        System.out.println("--------------");
        
        //order of operation
        System.out.println("Ahmet_" + 10 + 30);
        
        //first parentheses then concatenation
        System.out.println("Ahmet_" + (10 + 30));
        
        //first multiplication then concatenation
        System.out.println("Ahmet_" + 10 * 30);
        
    	//String
		//String is a class that represent a group of characters.
		//To create a string we have to put value inside "" (double quotes)
		
		String srt1 = "Good morning";
		String str2 = "Good morning";
		
		String str3; // declaring a variable
		str3 = "Hi there"; // assign a value or initialize a variable
		str3 = "Bye"; // re-assigning a value
		str3 = "I am" + "learning Java";
		
		// str = 123; // compiler will give an error
		// str = "" + 123;
		//------------------------------------
		//Arithmetic Operators:
		// +,-,*,/,% --> appLicable on numeric data types (byte, short, int, long, float, double)
		//+ --> concatenation on String data types
		
		//Casting in Java is a conversion of 1 type into another type	
        
        
	}

}

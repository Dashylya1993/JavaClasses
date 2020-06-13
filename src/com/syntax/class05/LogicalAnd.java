package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		
//		AND (&&)
//		if (true && true) --> true
//		if (true && false) --> false
//		if (false && true) --> false
//		if (false && false) --> false
		
		//Declare a number
		//if number is between  1-10 --> number is small
		//if number is between  11-100 --> number is medium
		//if number is between  101-1001 --> number is large
		
		int num = 6870;
		
		if (num >= 1 && num <= 10) {
			System.out.println(num + " is a small number");
		}else if (num >= 11 && num <= 100) {
			System.out.println(num + " is a medium number");
		}else if (num >= 101 && num <= 1001){
			System.out.println(num + " is a large number");
		}else {
			System.out.println(num + " is out of range");
		}
		
		
		
		
	}

}

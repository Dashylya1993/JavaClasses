package com.syntax.class03;

public class ElseIfCondition {
	public static void main(String[] args) {
		
		double num1 = 10.7;
		double num2 = 10.7;
		
		if (num1 > num2) {
			System.out.println("Number1 is larger than number2");
		} else if (num1 < num2) {
			System.out.println("Number1 is smaller than number2");
		}else {
			System.out.println("Numbers are equal");
		}
		
		System.out.println("----Different way------");
		
		if (num1 > num2) {
			System.out.println("Number1 is larger than number2");
		} else if (num1 < num2) {
			System.out.println("Number1 is smaller than number2");
		}else if (num1 == num2 ){
			System.out.println("Numbers are equal");
		}else {
			System.out.println("You will never come here!");
		}
		
		System.out.println("we are done");
		
		System.out.println("------------------------");
		
		//If it is none of them (example when day = 10)
		//print "invalid day"
		
		int day = 9;
		
		if (day == 1) {
			System.out.println("Monday");
		}else if (day == 2) {
			System.out.println("Tuesday");
		}else if (day == 3) {
			System.out.println("Wednesday");
		}else if (day == 4) {
			System.out.println("Thursday");
		}else if (day == 5) {
			System.out.println("Frieday");
		}else if (day == 6) {
			System.out.println("Saturday");
		}else if (day == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Not a correct day");
		}
		
		String name = "John" + 38 + true;
		System.out.println(name);
		
		
		
		
	}
	
	
	

}

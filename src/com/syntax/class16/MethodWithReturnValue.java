package com.syntax.class16;

public class MethodWithReturnValue {
	public static void main(String[] args) {
		
		//create a String and based and on the number of character define whether String is long or short
		//long if length > 10, short is less
		
		String str = "I love Java";
		
		int length = str.length();
		
		if (length >= 10) {
			System.out.println("Created String is long");
		}else {
			System.out.println("Created String is short");
		}
		
		//identify which number is the largest and then define whether this largest 
		TaskMethods obj = new TaskMethods();
		obj.larger(10,20);
		
	}
	
	int larger(int a, int b) {
		int larger;
		
		if (a>b) {
			larger = a;
		}else {
			larger = b;
		}
		return larger;
	}

}

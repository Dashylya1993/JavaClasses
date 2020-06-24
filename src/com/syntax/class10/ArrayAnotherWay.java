package com.syntax.class10;

public class ArrayAnotherWay {
	public static void main(String[] args) {
		
		//We created an array and stored the initial value
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursda", "Friday" };
		
		//Let us print the element with index 3
		System.out.println(weekdays [3]);
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);

		//We can not add elements to the array
//		weekdays [5] = "Saturday"; // runtime error
		
		//1st way
		double[] balances = {10000, 23.50, 5540.0};
		System.out.println("Total money is " + (balances[0] + balances[1] + balances[2]));
		
		//2nd way
		double total = balances[0] + balances[1] + balances[2];
		System.out.println("Total 1 is: " + total);
		
		//If I want to use int with double
		int tota2 = (int) balances[0] + (int) balances[1] + (int) balances[2];
		System.out.println("Total 2 is: " + tota2);
		
		//3rd way
		int tota3 = (int) (balances[0] + balances[1] + balances[2]);
		System.out.println("Total 3 is: " + tota3);
		
		
		//Don't ever create an array with 0 elements 'cause you can not add elements later
		int [] numbers1 = new int[0];
		
		int [] numbers2 = {};
		numbers2 [0] = 5;
		System.out.println(numbers2[0]);

		
		
	}

}

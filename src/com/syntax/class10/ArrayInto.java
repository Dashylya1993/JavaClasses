package com.syntax.class10;

public class ArrayInto {
	public static void main(String[] args) {
		//Array is a tray of tea cups
		
		int num1 = 10;
		int num2 = 15;
		int num3 = 20;
		int num4 = 25;
		
		//Declare and initialize one array of integers
		//Scanner scan = new Scanner();
		int[] numbers = new int[4]; //index from 0 to 3
		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 20;
		numbers[3] = 25;
		// this is wrong --> numbers[4]
		System.out.println(numbers[3]);
		
		//if array is storing integers
		//when I get one element I will get one int
		int element0 = numbers[0];
		
		
		System.out.println("------------------------------------");
		
		
		//We are just declaring, not initializing
		String[]carArray; //preferred way
		String carArray1[]; //works but not preferred
		
		//We are creating / initializing the array
		carArray = new String[3]; //The size is 3 --> with index 0, 1, 2
		//Storing cars
		carArray[0] = "BMW";
		carArray[1] = "Toyota";
		carArray[2] = "Benz";
		//carArray[3] = "Tesla"; //Will give an exception
		
		String car = carArray[2];
		System.out.println(car);
		
		
		System.out.println("------------------------------------");
		char[] letters = new char[4]; //we can not use like that char[4] letters = new char[];
		letters [0] = 'A';
		letters [3] = 'B';
		letters [2] = 'G';
		letters [1] = 'Z'; // wrong! Stars from 0, 1, 2, 3. If we have only 4 char, we can not use char [5]
		
		System.out.println("Printing before re-assigning " + letters [2]);
		
		
		//re-assigning another letter into spot with index 2
		letters [2] = 'K';
		
		System.out.println("Printing after re-assigning " + letters [2]);
		

	}

}

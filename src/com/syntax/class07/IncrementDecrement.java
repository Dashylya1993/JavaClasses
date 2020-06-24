package com.syntax.class07;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x = 10;
		x = x + 1;//11
		x += 1;//12
		//Another way to add 1 into the variable
		x ++; //post increment //13
		-- x; //pre increment //12
		
		System.out.println(x);
		
		
//		int y = 50;
//		y = y - 1;//49
//		y -= 1; //48
//		y -- ; //47
//		
//		System.out.println(--y);
//		System.out.println(y);
//	
		//3++; // compiler error
		//3--; // compiler error
		
		
		int z = 5; // pre increment 
//		System.out.println(z++);//5
//		System.out.println(++z);//6
		
		if(++z == 6) {
			System.out.println("Hi there");
		}
		
		int k = 10; //post increment
		if(k ++ == 11) {
			System.out.println("Nail was here");
		}
		
		//What if i want to increase by 2?
		int m = 5;
		// m++2// compiler error
		m += 2;
	}

}

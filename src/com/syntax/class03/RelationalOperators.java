package com.syntax.class03;

public class RelationalOperators {
public static void main(String[] args) {
	int a = 7;
	int b = 10;
	
	System.out.println(3>4);
	
	System.out.println(a>b);// false
	System.out.println(a<b);// true
	System.out.println(a==b);//false, we need use double == for data type boolean
	System.out.println(a != b);// true, we need use != for word "different"
	
	System.out.println("---------------------------");
	
	double i = 10.78;
	double j = 10.55;
	
	boolean result1 = i>j;// true// is i greater than j?
	System.out.println(result1);
	
	boolean result2 = i==j;
	System.out.println(result2); // false // is i equal to j/
	
	boolean result3 = i!=j;
	System.out.println(result3);// true // is i different from j?
	
	boolean result4 = i>=j;
	System.out.println(result4);// true // is i greater or equal to j?
	
	boolean result5 = i<=j;
	System.out.println(result5);//is i smaller than or equal to j?
	
	
	
	
	
}
	
}

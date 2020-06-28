package com.syntax.class15;

public class StringBufferDemo {
	public static void main(String[] args) {
		
		StringBuffer strBuffer = new StringBuffer("Hello");// is a mutable object = changeable
		strBuffer.append(" friends");// when we perform operation it happens on same object and NO NEW object gets created
		
		System.out.println(strBuffer);//Hello friends
		
		
		String str2 = "Hello"; //String is immutable object = not changeable
		str2.concat(" friends");// New object gets created that will have value "Hello friends" --> no one takes it
		System.out.println(str2);//Hello
		
	}

}

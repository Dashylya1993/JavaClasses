package com.syntax.class15;

public class ReplaceFunction {
	public static void main(String[] args) {
		
		String me = "I am a good tester. I am a good person";
		String str = "Hello";
		
		str.replace('e', 'E');
		System.out.println(str);
		
		me = me.replace("good", "great");
		System.out.println(me);
		
		me = me.replace("we", "us"); //if it find it --> replace if it will not --> does nothing
		System.out.println(me);
		
		String fromApplication = "Phone number is 123456789";
		fromApplication = fromApplication.replaceAll("[A-Z]","");
		System.out.println(fromApplication);//Phone number is 123456789
		
		
		fromApplication = fromApplication.replaceAll("[a-z]","").trim();
		System.out.println("New String value is = " + fromApplication);
		
		//replace all letters from the String
		String another = "Hello12345";
		another = another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);
				
		//replace all letters from the String
		String anotherWay = "HelloYIIghffjfjffl6576565";
		anotherWay = anotherWay.replaceAll("[A-Za-z]","");//2345
		System.out.println(anotherWay);
		
		//replace all numbers from the String
		String mix = "Hello76567 friends 678000";
		mix = mix.replaceAll("[0-9]",  "");//Hello friends 
		System.out.println(mix);
		
		//replace all special characters
		String mix1 = "hello &%$#@";
		mix1 = mix1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(mix1);
		
	}

}

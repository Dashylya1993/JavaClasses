package com.syntax.class14;

public class StringMethodsMore {
	public static void main(String[] args) {
		
		 System.out.println("---------------- . charAt() method------------");
		 
		 String season = "Summer";
		 char character = season.charAt(1);
		 System.out.println(character);
		 
		 
		 System.out.println("---------------- . indexOf() method------------");
		 
		 int index = season.indexOf('S');
		 System.out.println(index);
		 
		 int index1 = season.indexOf('m', 3);
		 System.out.println(index1);
		 
		 
		 System.out.println("---------------- . substring() method------------");
		 
		 String message = "You guys are awesome";
		 
		 String substring = message.substring(4);//take string starting from index 4
		 System.out.println(substring);
		 
		 String middleWord = message.substring(4,8);
		 System.out.println(middleWord);
	}

}

package com.class14;

public class StringManipulations {
public static void main(String[] args) {
		String str="I am good tester#1!";
		String newStr=str.replace("a","e");
		System.out.println(newStr);
		//what we are looking for replace, new value 
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		str=str.replace("!","?");
		System.out.println(str);
		
		
		str=str.replace("1", "2");
		System.out.println(str);
		
		//2 Replace Numbers
		String str1="12Hello 3214 World 456%&(&^";
		String str4=str1.replaceAll("[0-9]","");
		System.out.println(str4);
			// Replace special Characters	from 
		 String strg=str4.replaceAll("[^A-Za-z]", " ");
			System.out.println(strg);
			
		//replacing A-Za-z
		String str5=str4.replaceAll("[A-Za-z]","");
			System.out.println(str5);
			

			String str2="1Hello123";
			System.out.println(str2.replaceAll("[^0-9]", ""));
				
		
	
}
}

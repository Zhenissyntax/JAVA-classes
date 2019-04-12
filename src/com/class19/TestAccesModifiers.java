package com.class19;
public class TestAccesModifiers{
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.isPalindrome("madam"); // public method within the same package
		obj.reverseString("Hello"); // protected method
		System.out.println(obj.name1);//default variable
		System.out.println(obj.name2);//protected variable
		System.out.println(obj.name3);//public method
	}
}
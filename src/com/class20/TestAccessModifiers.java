package com.class20;
import com.class19.AccessModifiers;
public class TestAccessModifiers {
	public static void main(String[] args) {
		AccessModifiers obj=new AccessModifiers();
		obj.isPalindrome("bye");
		System.out.println(obj.name3); //public method in different package
	}

}

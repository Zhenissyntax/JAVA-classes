
package com.class22;
public class ConstructorOverLoading{
	ConstructorOverLoading(){
		System.out.println("I am a counstructor with no parameters");
	}
	ConstructorOverLoading(String str, String str2){
		System.out.println("I am a constructor with 2 String parameters");
	}
	
	ConstructorOverLoading(int a){
		System.out.println("I am a constructor with an 1 integer parameter");
	}
}
package com.class21;

public class ConstructorTypes {

	ConstructorTypes(){
		System.out.println("I am a constructor with no parameters");
	}
	ConstructorTypes(String str){// str-local variable to a constructor
		System.out.println("I am a constructor with 1 parameter "+ str);
	}
	ConstructorTypes(int a, String str){
		System.out.println("I am a constructor with 2 parameters "+ a +" and "+str);
	}
	
	
	public static void main(String [] args) {
		ConstructorTypes obj=new ConstructorTypes();
		ConstructorTypes obj2=new ConstructorTypes("String");
		ConstructorTypes obj3=new ConstructorTypes(78,"String");

	}
}

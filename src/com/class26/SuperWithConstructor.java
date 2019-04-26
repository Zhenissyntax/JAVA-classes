
package com.class26;
public class SuperWithConstructor{
	
	public SuperWithConstructor(){
		System.out.println("I am a parent class constructor");
	}
	public SuperWithConstructor(String str){
		System.out.println("I am a parent class constructor");
	}
}

class ChildOfSuperWithConstructor extends SuperWithConstructor{
  public ChildOfSuperWithConstructor(){  
	  
	  super("hello");
	System.out.println("I am a child class");
	}
}
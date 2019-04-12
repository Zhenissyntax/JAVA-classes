
package com.class20;
public class InstanceVariables{
	 String name="John"; //instance variables can have access modifiers
	
	public static void main(String[] args) {
		String name="Anna";
		System.out.println(name);
		System.out.println("-------------Changing value of the local variable");
		name="Olga";
		System.out.println(name);
	
	
	InstanceVariables obj =new InstanceVariables();
	System.out.println(obj.name);
	}
	}


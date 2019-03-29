package com.class12;
public class StringManip {
	public static void main(String [] args) {
		//contains() ----> checks specific values in the string
		String str ="Good morning, student!";
		boolean contains=str.contains("students");
	System.out.println(contains);
	
	System.out.println();    
	
	String present="Welcome, Asel";
	 boolean flag= present.contains("Welcome,");
	 System.out.println(flag);
	
	 boolean flag1= present.toLowerCase().contains("Welcome,");
	System.out.println(flag1);
	
	// startsWith(), endsWith(),----> will return true if String starts/ends wit
	//else ---->.false
	String a="syntax";
	boolean bb=a.startsWith("s");
	System.out.println(bb);
	System.out.println(a.endsWith("y"));
	
	
	//isEmpty(); if length of a string is =0 ----> String is empty ,else -> its no
	String kk="";
	boolean isEmpty=kk.isEmpty();
	System.out.println(isEmpty);
	
	
	// concat()	; ---> will concatenate 1 string to the end of another
	String str3="Hello ";
	String str4= "Ali";
	System.out.println(str3+str4);
	System.out.println(str3.concat(str4));
	
	//trim(),---> will remove spaces at the begining and at the end of your String
	String expected="You may qualify for a multi-policy discount!";
	String actual=" You may qualify for a multi-policy discount! ";
	actual=actual.trim();
	System.out.println(expected.equals(actual));
	
	
	}
}
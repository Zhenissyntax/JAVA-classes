package com.class14;
public class Tasks {
	public static void main(String[] args) {
		String str="Today is good weather";
		String ar=str.replace(" ","");
		System.out.println(ar);
	
	String lettter="1232445Good ^%%^morning";
	String let=lettter.replaceAll("[A-Za-z]", "");
	System.out.println(let.length());
	
	String a="Is it Saturday! Is it raining!Do we have a Java Class today?";
	String [] b=a.split("[!?]");
	System.out.println(b.length);
	
	}
}
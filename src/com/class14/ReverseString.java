package com.class14;
public class ReverseString{
	public static void main(String[] args) {
		//reverse a String without using a reverse fuction
		//1 using toCharArray();
		String original="Today is Java Class";
		String reverse="";
		char [] array=original.toCharArray();
		for (int i=array.length-1; i>=0;i--) {
		reverse=reverse+array[i];
		}
		System.out.println("Reversed String is: "+reverse);
	
	//2 using charAt();
		String reverse1="";

		for (int i=array.length-1; i>=0;i--) {
			reverse1=reverse1+original.charAt(i);
			
		}System.out.println("reversed String is: "+reverse1);
	
	//3 using substring()
		String a="";
		for (int i=original.length(); i>0;i--) {
			a=a+original.substring(i-1,i);}
		
		System.out.println(a);
			
			
		}
		
	}
	

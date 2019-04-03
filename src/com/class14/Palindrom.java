package com.class14;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in) ;
		System.out.println("Please enter any word to check if it palindrome");
		String word=sc.nextLine();
		String reverse="";
		for (int i=word.length()-1; i>=0; i--) {
			reverse+=word.charAt(i);
			
		}
			System.out.print(reverse);
			if (word.equalsIgnoreCase(reverse)) {
				System.out.println(" The word is a palindrome");
			} else {
				System.out.println("The word is not a palindrome");
			}
			
		
		
	}
}
package com.class6;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		
		
		 String gr;
		String grade;
		 Scanner sc=new Scanner (System.in);
		System.out.println("Please enter your grade ");
		gr=sc.nextLine();
		 
		switch (gr)  {
		case "A":
			grade="Excellent";
			break;
		case "B":
			grade= "Good";
			break;
		case "C":	
		   grade="Average";
		   break;
		case "D":
			grade= "Bad";
		break;
		 default:
			 grade="Unacceptable";
	
		} System.out.println("Your grade is " + grade);
		
	}
}
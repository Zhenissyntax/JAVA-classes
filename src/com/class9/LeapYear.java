package com.class9;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {

	
		
		
		int year;
	 Scanner sc=new Scanner(System.in) ;
		 
	 for (int i=0; i<10; i++) {
		 System.out.println("Please enter a guessed leap year");
		 year=sc.nextInt();
		 
		 if (year%400==0) {
			 System.out.println("Year is a leap year");
		break;
		 } else if 
			 (year%400==0 && year%100==0) {
			 System.out.println("Year is a leap year");
		 break;
		 } else {
			 System.out.println("Year in NOT a leap year");
		 }
		 
	 }
		
		
	}
}
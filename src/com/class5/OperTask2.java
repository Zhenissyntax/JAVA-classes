package com.class5;

import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {
		int quiz;
		int midterm;
		int finals;
		int avgScore;
     Scanner sc=new Scanner (System.in);
     System.out.println("Enter your quiz ");
	  quiz = sc.nextInt();
	  System.out.println("enter your mid terms");
	  midterm=sc.nextInt();
	  System.out.println("enter your finals");
	  finals=sc.nextInt();
	  avgScore=(quiz +midterm+ finals)/3;
	  System.out.println("your average score is "+ avgScore);
	 if (avgScore >=90) {
		 System.out.println("Your grade is A");
	 } else if (avgScore >=70 || avgScore <90) {
		 System.out.println("Your grade is B");
	 } else if (avgScore >=50 && avgScore<70) {
	 System.out.println("Your grade is C");
	} else if (avgScore < 50) {
		System.out.println("Your grade is C");
	}
	}
}

package com.class6;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
	
		int num1, num2;
		int result;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the first number ");
		num1=sc.nextInt();
		System.out.println("Please enter the second number");
		num2=sc.nextInt();
		System.out.println("Please enter your operator (* + / -)");
		char operator = sc.next().charAt(0);
		switch (operator) {
		case '*':
			result=num1*num2;
		break;
		case '+':
			result=num1+num2;
		break;
		case '/':
			result=num1/num2;
		break;
		case '-':
		result=num1-num2;
		break;
		default:
			result=0;
		
		}
		System.out.println("Based on operator your result is " + result);
	
	}
}
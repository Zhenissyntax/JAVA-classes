package com.class7;

import java.util.Scanner;

public class LoopHome{
	public static void main(String[] args) {
		 
		int b= 2;
		double soda;
		
		Scanner sc =new Scanner (System.in);
		
		
		do {
			System.out.println("pay for the soda");
		  soda=sc.nextDouble();
			
		} while (soda!=1.99);
		  System.out.println("Please enjoy your soda");

		}
		
		
		
	}


package com.class7;

import java.util.Scanner;

public class WhileTask {
	public static void main(String[] args) {
	
	String name;
	int a=1;
	Scanner scan=new Scanner (System.in);
	while (a<=3) {
		System.out.println("Please enter your name");
	name=scan.nextLine();
	System.out.println("You are doing great " + name);
	a++;
	}
		
	
	
	}
}
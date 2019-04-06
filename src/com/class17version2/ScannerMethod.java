package com.class17version2;

import java.util.Scanner;

public class ScannerMethod{
	public static void main(String[] args) {
	ScannerMethod obj=new ScannerMethod();
	Scanner scan=new Scanner (System.in);
	System.out.println("Please enter any two numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	obj.sum(a, b);
	obj.subb(12, 9);
	obj.sub();
	}
	
	void sum (int a,int b) {
		System.out.println(a+b);
	}
	void subb(int x, int y) {
	System.out.println(x-y);	
	}
	void sub() {
		int z=15;
		int k=6;
		System.out.println(z-k);
	}
}
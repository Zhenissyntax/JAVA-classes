package com.class14;
public class FibonacciSeries{
	 public static void main(String[] args) {
		int a=1;
		int b=0;
		int c=0;
		for (int i=0; i<20; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(a+ " ");
		}
	 }
	 
}
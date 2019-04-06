package com.class17version2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Task1 mm=new Task1 ();
		mm.meth();

	}
	void meth() {

		int snumber;
		int lnumber;
		int sumOdd=0;
		int sumEven=0;
		Scanner sc=new Scanner (System.in) ;
		System.out.println("Please enter the start point of the range");
		snumber=sc.nextInt();
		System.out.println("Please enter the end point of the range ");
		lnumber=sc.nextInt();
		for (int a=snumber; a<=lnumber;  a++ ) {
			if (a%2==0) {
		       sumEven+=a;
			} else {
				sumOdd+=a;
			}
		}
		System.out.println("The sum of Odd numbers of your range " +snumber+ " to " + lnumber+ " is " +sumOdd);
		System.out.println("The sum of the Even numbers of your range  "+snumber+ " to " + lnumber + " is " +sumEven);
		
	}
}
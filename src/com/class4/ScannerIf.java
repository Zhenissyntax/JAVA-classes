package com.class4;

import java.util.Scanner;

public class ScannerIf{
	public static void main(String[] args) {
		//enter city and temperature in  Fahrenheit
	// Your programm shoud convert in the F ====>C
		//Your programm shoud say the temperature in the city ___ is ___
		String cityName;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("Please enter your city");
		cityName=myScanner.nextLine();
		System.out.println("Please enter your temperature");
		temp=myScanner.nextInt();
		System.out.println(temp);//formula (F-32)*5/9;
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The temperature in the city "+ cityName+" is "+ convertedTemp);
	}
}

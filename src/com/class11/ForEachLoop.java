package com.class11;

import java.util.Scanner;

public class ForEachLoop {
	public static void main(String[] args) {
		
		
	
	String [] cars= {"Toyota", "Mazda", "Lada", "BMW", "Mercedes", "Nissan"};
	for (int i=0; i<cars.length; i++) {
	
	System.out.println(cars[i]);}
	System.out.println();
	for (String auto:cars) {
		System.out.println(auto);
	}

	String[] countries= {"Kazakhstan", "England", "USA","Russia"};
     for (int i=0; i<countries.length;i++) {
    	 if (countries[i].equals("Kazakhstan")) {
    		 System.out.println("Astana");
    	 }else if (countries[i].equals("Enagland")) {
    	 System.out.println("London");
     }   else if (countries[i].equals("USA")) {
    	 System.out.println("Washington DC");
     }   else if (countries[i].equals("Russia")) {
    	 System.out.println("Moscow");
     }
	
	}
   System.out.println();
	
	 for (String country: countries) {
		 switch (country) {
		 case "USA":
			 System.out.println("Washington");
			 break;
		 case "Kazakhstan":
			 System.out.println("Astana");
			 break;
		 case "England":
			 System.out.println("London");
			 break;
		 case "Russia":
			 System.out.println("Moscow");
			 break;
		 
		 }
	 }
	
	 int [] numbers= {15,48,46,25,79};
	 int sum =(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
	 System.out.println("The summary is "+sum);
	 
	 
	 
	}
}
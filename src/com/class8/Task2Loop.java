package com.class8;
public class Task2Loop {
	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		 while (workDay) {
			 System.out.println("I need a day off");
		    if  (day==6)  {
			System.out.println("I Do not need a day off");
			 workDay=false;
			 
		 }
		  day++;  
		 
		 }
		  
		
	}
}
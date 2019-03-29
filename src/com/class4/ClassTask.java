package com.class4;
public class ClassTask {
	
	public static void main(String[] args) {
		 double mor=4.2;
	     double affordableMor=4.5;
	       int price=190000;
	        if (mor<affordableMor) {
	            System.out.println("User will buy a house");
	            if (price<200000) {
	                System.out.println("User will pay cash");
	            } else {
	                System.out.println("User will apply for a loan");
	            }
	        }else {
	            System.out.println("User will not buy a house");
	        }
	}
}



//Task 2

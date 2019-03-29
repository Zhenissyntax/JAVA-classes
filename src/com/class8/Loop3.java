package com.class8;

import java.util.Scanner;

public class Loop3 {
public static void main(String[] args ) {
	 for (int i=1; i<=10; i++) {
		 if (i==5) {
			 break;
		 }
	System.out.println(i);
	 }
	
	 
	for(int i=0; i<5; i++) {
		if (i==2) {
			continue;
			
		}System.out.println(i);
	}

  for (int c=1; c<=20; c++) {
	  if (c%3==0) {
		  continue;
	  } System.out.println(c);
  }


    //prompt user to enter 2 number and compare them
     //*at the end print largest
     Scanner myScanner;
    int num1, num2;
      int largest = 0;
    myScanner=new Scanner(System.in);
      System.out.println("Please enter first number");
      num1=myScanner.nextInt();
      System.out.println("Please enter second number");
      num2=myScanner.nextInt();
       
      if (num1>num2) {
    	  largest=num1;
      }else if (num2>num1) {
    	  largest=num2;
      } else { 
    	  System.out.println(num1+" is equals to "+num2);}
    	  
          
    		System.out.println(largest + " is the largest");
     





}
}

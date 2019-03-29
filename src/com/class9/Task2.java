package com.class9;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		int r;
	
		int price;
		int pay;
		int extra;
		String item;
         Scanner sc=new Scanner (System.in) ;
         System.out.println("Please enter the item you want to buy");
			item=sc.nextLine();
		 System.out.println("Please enter the price of your item");
		   price=sc.nextInt();
		 System.out.println("Please pay for your item");
		    pay=sc.nextInt();
		   for (int p=2 ; p<=2 ; p++  ) {
            if(pay>=price) {
           
		   
		   }else  {
			   r=price-pay;
			   
			   System.out.println("Not enough  money to buy item ,pay more " + r);
		       extra=sc.nextInt(); 
		   } 
            System.out.println("Thank you for shoping");
	}
	}
}

package com.class17version2;
public class Task3And4 {
	public static void main(String[] args) {
		Task3And4 mymethod=new Task3And4 ();
		mymethod.automatization();	
		
	}
	
	void automatization() {
		for (int i=1; i<=5; i++) {
			 for (int k=1; k<=i; k++) {
			  System.out.print(k);
		
			 }
			 System.out.println();
			}
		
		
		for (int b=1; b<=5;b++) {
			for (int c=1; c<=b; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		   for (int a=1; a<5; a++) {
			   for (int d=5; d>a; d--) {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
	}
		
	
	
	
}
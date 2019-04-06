package com.class17version2;
public class LoopFor {
	public static void main(String[] args) {
		
	/*	for (int i=1; i<5; i++) {
	 
			for (int k=1; k<=i; k++) {
				System.out.print("*");
				} System.out.println();
	*/	
		
	for (int i=1; i<=4; i++) {
	
		 for (int s=1; s<=6; s++ ) {
			 if(i==1 || i==4 ||  s==1|| s==6) {
			 System.out.print("*");
		 }  else {
			 System.out.print(" ");
		 }
		 }
			 System.out.println();
	
	}
}
}
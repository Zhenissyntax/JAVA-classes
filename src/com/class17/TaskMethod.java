package com.class17;
public class TaskMethod {
	int a, b,n;
	String pal;
	
	void number(int a, int b) {
		if (a>b) {
			System.out.println("A is larger than b");
		} else {
			System.out.println("B is larger than A");
		}
		
		}
	
	void evenorodd(int n) {
		if (n%2==0) {
			System.out.println("number is even");
		} else {
			System.out.println("Numbers is odd");
		}
	}
	    
	 void palindrome(String pal) {
		 String reverse="";
			for (int i=pal.length()-1; i>=0; i--) {
				reverse+=pal.charAt(i);
				
			}
				System.out.print(reverse);
				if (pal.equalsIgnoreCase(reverse)) {
					System.out.println(" The word is a palindrome");
				} else {
					System.out.println("The word is not a palindrome");
				}
	 }
	
	public static void main(String[] args) {
		TaskMethod large=new TaskMethod();
		large.number(20, 50);
		large.evenorodd(10);
		large.palindrome("dab");
	}
}
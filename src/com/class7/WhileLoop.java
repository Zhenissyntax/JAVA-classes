package com.class7;
public class WhileLoop {
	public static void main(String[] args) {
		int b=20;
		while (b<=30) {
		System.out.println(b);
		b++;
		}
		
	int c=10;
	while (c>=5) {
	System.out.print(c+ " "); // in 1  Line
	c--;
	
	}
    //I want to print values from 1 to 20 inclusive but all in 1 line with space;
    int q=1;
    
    while (q<=20) {
        System.out.print(q+" ");
        q++;
    }
    System.out.println("-----------------------");
    //I want to print values from 10 to 1;
    
    int e=10;
    
    while(e>=1) {
        System.out.println(e);
        e--;
    }
	}

}
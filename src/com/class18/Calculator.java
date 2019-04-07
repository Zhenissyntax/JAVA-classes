
package com.class18;
 public class Calculator{
	 void sum(int x, int y, int d) {
		 System.out.println(x+y+d);}

	 
	 void min(int x,int y,int d) {
		 if (x<y) {
			 System.out.println(x+" is min");
		 } else if (y<d) {
			 System.out.println(y+" is min");
			 
		 }else if(d<x) {
			 System.out.println(d+" is min");
		 }
	 }
	 
	 void maximum(int x, int y, int z) {
		 if (x>y) {
			 System.out.println(x+" is max");
		 } else if (y>z) {
			 System.out.println(y+" is max");
			 
		 }else if(z>x) {
			 System.out.println(z+" is max");
		 }
	 }
	    void average(int a,int b,int c) {			
	    int	average=(a+b+c)/3;
	    	System.out.println(average+" is average");
	    }
	 
 }
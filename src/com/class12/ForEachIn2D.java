
package com.class12;
public class ForEachIn2D{
	public static void main(String[] args) {
		/*Create grocery list
		 * fruits{}
		 * Vegetables{}
		 *Dairy{}
	*/
	
	String[][] grocery= {
			{"Apple", "Orange", "Banana"},
			{"Tomato","Potato", "Spinach"},
			{"Milk", "Icecream","Cheeese"}
			};
	
	
	
	for (int i=0; i<grocery.length; i++) {
		for(int k=0;k<grocery[i].length;k++) {
	System.out.print(grocery[i][k]+ " ");
		}
	System.out.println();
	}
	
	
	System.out.println();
	
	for (String [] a:grocery) {
	for (String b:a)	{
		System.out.print(b+" ");
	}System.out.println();
	}
	
	
	
	
	
	}
	
	}

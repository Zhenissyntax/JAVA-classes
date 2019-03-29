package com.class11;
public class TaskTwoDArray{ 
	public static void main(String[] args) {
		
	String [][] cars = {
			{"Chvey", "Mustang","Dodge"},
			{"BMW","Benz","VW"},
			{"Lexus","Nissan","Toyota"}
	};
	for (int row=0; row<3;row++) {
		for (int col=0; col<3;col++) {
			System.out.print(cars[row][col]+" ");
		}System.out.println();
	}
		System.out.println();
		System.out.println();
	
	String [][] countries= {
			{"USA","Canada","Portuga'"},
			{"Russia","Kazakhstan","England"},
			{"Bolgariya","Chech","Mexico"},
			{"China","Korea","Japan"},
			{"Thailand","Vietnam","Bolivia"}
	};
	for(int row=0; row<5;row++) {
		for(int col=0; col<3;col++) {
			System.out.print(countries[row][col]+" ");
		}System.out.println();
			
			
	}
	
	
	
}
}
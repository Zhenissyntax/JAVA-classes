package com.class14;
public class StringManipulation1{
	public static void main(String[] args) {
		//toCharArray()-converts string to array of characters
		
		String str="saturday";
		char [] array=str.toCharArray();
		for (int i=0; i<array.length;i++) {
			System.out.println(array[i]);
		}System.out.println();
		 for (char arr:array) {
			 System.out.println(arr);
		 }
		System.out.println();
	//reverse word
	for (int i=array.length-1; i>=0;i--) {
		System.out.println(array[i]);
	}
	
	}
	
}
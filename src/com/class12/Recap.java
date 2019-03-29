package com.class12;

public class Recap {
public static void main(String[] args) {
	
	int [][] arr= {
			{1,2,3},
			{10,20,30},
			{100,200,300}
			
	};
	for (int i=0; i<arr.length; i++) {
	for (int k=0; k<arr[i].length; k++) {
	System.out.print(arr[i][k]+ " ");}
     System.out.println();
	}
for (int[] num:arr) {
	for (int numb:num) {
		System.out.print(numb+" ");
	}
	System.out.println();
}
}

}

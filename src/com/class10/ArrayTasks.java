package com.class10;
public class ArrayTasks {
	public static void main(String[] args) {
		
		char [] arrays= {'A' , 'B', 'C', 'D', 'F'};
		System.out.println(arrays[1]);
		
		char[] way=new char[5];
		way[0]= 'A';
		way[1]='B';
		way[2]='C';
		way[3]='D';
		way[4]='F';
		System.out.println(way[1]);
		
		
		String[] names= {"wolf", "tiger", "elephant"};
		System.out.println(names[2]);
		
		
		
		String[] Names2=new String[3];
		Names2[0]="wolf";
		Names2[1]="tiger";
		Names2[2]="elephant";
		System.out.println(Names2[2]);
		
		
		
		
		
		String[] Data= {"Java", "Saturday", "Day", "Coding", "is"};
		System.out.println(Data[1]+" "+Data[4]+" "+Data[0]+" "+Data[3]+" "+Data[2]);
		
		
		
		String[] types=new String[5];
		types[0]="Java";
		types[1]="Saturday";
		types[2]="Day";
		types[3]="Coding";
		types[4]= "is";
		
		
		System.out.println(types[1]+" "+types[4]+" "+types[0]+" "+types[3]+" "+types[2]);
		
		
	}
}
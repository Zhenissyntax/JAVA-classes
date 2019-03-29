package com.class5;

import java.util.Scanner;

public class TaskOper {
	public static void main(String[] args) {
	
	int person1;
	int person2;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter height of person 1 ");
    person1=sc.nextInt();
	System.out.println("Enter height of person 2");
	person2=sc.nextInt();
	if (person1<5) {
		System.out.println("The height of person 1 is short");
	}else if (person2<5) {
		System.out.println("The height of person 2 is short");
		
	} else if (person1>=5 && person1<=6) {
		System.out.println("The height of person 1 is medium");
	} else if (person2>=5 && person2<=6) {
		System.out.println("The height of person 2 is medium");
	} else if (person1 >6) {
		System.out.println("person 1 is tall");
	} else {
	   System.out.println("person 1 is tall");
	   
	} if (person2 >6) {
		System.out.println("person 2 is tall");
	} else {
		System.out.println(" person 2 is tall");
	}

}
}
package com.class19;

import java.util.Scanner;

public class Student{
	char getGrade() {
		char grade;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter your score");
		int score=sc.nextInt();
		if(score>90) {
			grade='A';
		}else if (score>80) {
			grade='B';
			
		}else if (score>70) {
			grade='C';
		}else if (score>50) {
			grade='D';
		}else {
			grade='F';
			
		}
		return grade;
	}
	public static void main(String[] args) {
		Student sd=new Student();
		System.out.println(sd.getGrade());
		
	}
}
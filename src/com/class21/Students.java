
package com.class21;
public class Students{
	
	int average;
	
	Students(String studentName, int grade1, int grade2, int grade3){
		average=(grade1+grade2+grade3)/3;
		System.out.println(studentName+" Your average of 3 subject grades is: "+average);
	}
	
	public static void main(String[] args) {
		Students stud1=new Students("James",50,78,85);
		Students stud2=new Students("Sam",59,80,85);
		Students stud3=new Students("John",40,50,60);
		Students stud4=new Students("Kelly",90,95,77);
		Students stud5=new Students("Mike",49,66,81);
	}
	
}
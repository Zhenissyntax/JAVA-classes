
package com.class26;
public class Employee{
	String name,lastName;
	Employee(){
	System.out.println("I am a parent class  constructor");
		
	}
	Employee(String name, String lastName){
		this.lastName=lastName;
		this.name=name;
	}
}

class Tester extends Employee{
	int salary;
	
	Tester(int salary, String name,String lastName){
		super(name,lastName);
		this.salary=salary;
	}
	public void displayDetails() {
		System.out.println("Employee "+ name+" "+lastName+" has a salary of "+salary);
		
	}
}
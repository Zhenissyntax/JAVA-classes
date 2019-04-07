package com.class18;
public class Application3{
	
	//Create another class called Application
	//from this application class create 3 different instances/objects of it and print the properties and functions/methods
	String model="Toyota";
	String model2="BMW";
	String model3="MB";
	
	void drive() {
		System.out.println("drives smooth");
	}
	void reliable() {
	System.out.println("reliable car");
	}
	public static void main(String[] args) {
		Application3 car1=new Application3();
		System.out.println(car1.model);
		car1.reliable();
		car1.drive();
		
		Application3 car2=new Application3();
		System.out.println(car2.model2);
		car2.drive();
		car2.reliable();
		
		Application3 car3=new Application3();
		System.out.println(car3.model3);
		car3.reliable();
		car2.drive();
		
		
	}
}
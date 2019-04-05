package com.class15;
public class Dog{
	String color;
	int years;
	String name;
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		dog1.color="White";
		dog1.years=2;
		dog1.name="Husky";
		
		
		
		Dog dog2=new Dog();
		dog2.color="Brown";
		dog2.years=5;
		dog2.name="Bulldog";
		
		Dog dog3=new Dog();
		dog3.color="Black";
		dog3.years=4;
		dog3.name="Labrador";
		
		
	}
	
	void eat() {
		System.out.println("Can eat");
	}
	void run() {
		System.out.println("Can run fast");
	}
	void sleep() {
		System.out.println("can sleep");
		
	}
}
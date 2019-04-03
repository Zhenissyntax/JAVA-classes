package com.class15;
public class Phone {
	boolean camera, light;
	String color, brand;
	public static void main(String[] args) {
		Phone phone1=new Phone();
		phone1.camera=true;
		phone1.light=true;
		phone1.color="black";
		phone1.brand="Apple";
	
		phone1.record();
		phone1.call();
		phone1.text();
		System.out.println();
		Phone phone2=new Phone();
		phone2.camera=true;
		phone2.light=false;
		phone2.color="Gray";
		phone2.brand="Samsung";
		phone1.record();
		phone1.call();
		phone1.text();
		
		System.out.println();
		
		Phone phone3=new Phone();
		phone3.camera=false;
		phone3.light=true;
		phone3.color="Gold";
		phone3.brand="HUAWEI";
		phone1.record();
		phone1.call();
		phone1.text();
		
	}	
	 void record() {
	 System.out.println("We can make record on our "+brand);
	 }
	 void call () {
		 System.out.println("we can make a call");
	 }
	 void text() {
		 System.out.println("We can send a message");
	 }
	
				
	
	
}
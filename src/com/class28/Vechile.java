package com.class28;

public abstract class Vechile {
	
	static int vechileCount;
	Vechile(){
		vechileCount++;
	}
	//public static abstract void gps() WE CANNOT HAVE STATIC FINAL PRIVATE ABSTRACT METHOD BECOUSE CANNOT OVERRIDE THEM
	public abstract void start();
	 
	
	
	public abstract void drive();

	public void stop() {
		System.out.println("Stop vechile by pressing break");
	}
	public static void displayTotalVechile() {
		System.out.println("Total vechiles we built= "+ vechileCount);
	}

}

abstract class Car extends Vechile {

}

class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW car starts remote");
		// TODO Auto-generated method stub

	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");
		// TODO Auto-generated method stub

	}

}

class Toyota extends Car {

	@Override
	public void start() {
		System.out.println("Toyota car starts with push button");
		// TODO Auto-generated method stub

	}

	@Override
	public void drive() {
		System.out.println("Toyota car drives safe");
		// TODO Auto-generated method stub

	}

}

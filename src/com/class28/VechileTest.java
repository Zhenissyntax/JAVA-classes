
package com.class28;
public class VechileTest{
	public static void main(String[] args) {
		
	
	Car car=new BMW();
	car.drive();
	car.start();
	car.stop();
	Vechile.displayTotalVechile();
	
	new BMW();
	new Toyota();
	Vechile.displayTotalVechile();
	}
}
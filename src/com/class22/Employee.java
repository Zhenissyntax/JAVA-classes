package com.class22;

public class Employee {
	public static String department="IT";
	protected int salary1;
	public int salary;
	public void  getPaid() {
		System.out.println("Employee get paid "+ salary);
	}
	
	public static void work() {
		System.out.println("Employee works in "+department+" department");
	}
	protected void test() {
		System.out.println("I am a protected");
		
	
	}
	
	void test1() {
		System.out.println("i am a default");
	}
	

}

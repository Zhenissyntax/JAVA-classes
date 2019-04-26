
package com.class25;
public class Student{
	public void study() {
		System.out.println("Students must study");
		
	}
	protected void doHomeWork() {
		System.out.println("Students must do homework");
	}
	void attendClasses() {
		System.out.println("Students must attend classes");
	}
	private void doResearch() { /// private methods cannot be overriden
		System.out.println("Students must do research");
	}
}


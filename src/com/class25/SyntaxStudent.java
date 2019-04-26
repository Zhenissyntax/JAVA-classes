
package com.class25;
public class SyntaxStudent extends Student{
	public void study() {
		System.out.println("Syntax students must study HARD");
		
	}
	protected void doHomeWork() {
		System.out.println("SyntaxStudents must do REPL");
	}
	void attendClasses() {
		System.out.println("SyntaxStudents must attend ALL classes and take notes");
	}
	private void doResearch() { //private methods cannot be overriden
		System.out.println("SyntaxStudents must make uncle Google their best friend");
	}
}

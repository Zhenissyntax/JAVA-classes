
package com.class26;
public class A{
	public void display(int a) {
		System.out.println("hey");
	}
	public void display(String b) {
		System.out.println("IT");
	}
		public void display(double d) {
			System.out.println("TEch");
		
	}
}

 class B extends A {
	public void display(int a) {
		System.out.println("bye");
	}
}
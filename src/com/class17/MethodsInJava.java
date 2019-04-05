package com.class17;

public class MethodsInJava {
	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.hello();
		obj.findLargest(20, 10); // calling method FindLargest and passing values
		obj.findLargest(30, 31);
		obj.helloINstructor("Weqas");
		obj.helloINstructor("Arif");
		// how to find largest number

	}
	void helloINstructor(String name) {  // method with 1 parameter
		System.out.println("Hello "+name);
	}
	void hello() {  //method signature
		System.out.println("Hello"); //method body
	}

	void findLargest(int a, int b) { //method with 2 parameters

		if (a > b) {
			System.out.println("A is larger than b");
		} else {
			System.out.println("B is a larger than A");
		}
	}

}

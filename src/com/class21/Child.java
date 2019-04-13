
package com.class21;
public class Child extends Parent{
	void swim() {
		System.out.println("Can swim");
	}
	
	public static void main(String[] args) {
		
		Child childObj=new Child();
		System.out.println(childObj.eyeColor);
		System.out.println(childObj.hairColor);
		System.out.println(childObj.nose);
		childObj.swim();
	}
}
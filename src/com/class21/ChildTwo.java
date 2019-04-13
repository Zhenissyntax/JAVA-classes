
package com.class21;
public class ChildTwo extends Parent{
	void playTennis() {
		System.out.println("Can play Tennis");
	}
	public static void main(String[] args) {
		ChildTwo child2=new ChildTwo();
		System.out.println(child2.eyeColor);
		System.out.println(child2.hairColor);
		System.out.println(child2.nose);
		child2.playTennis();
	}
	
}
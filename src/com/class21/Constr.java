
 
package com.class21;
public class Constr{
	static Constr() {// we cannot use constructor as a static
		System.out.println("hi");
		
	}
	public static void main(String[] args) {
		Constr a=new Contr();
	}
}
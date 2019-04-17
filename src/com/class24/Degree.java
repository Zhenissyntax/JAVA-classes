
package com.class24;
public class Degree{
	public void getDegree() {
		System.out.println("I got degree");
	}
}

 class Undergraduate extends Degree {
	@Override
   public void   getDegree(){
		System.out.println("I am an Undergraduate");
	}
}
 
 class Postgraduate{
	 public void getDegree() {
		 System.out.println("I am a Postgraduate");
	 }
 }
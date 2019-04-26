
package com.class26;
public class PhoneTest{
	public static void main(String[] args) {
	PhoneClass phone=new PhoneClass();
    phone.hasCamera();
    phone.MakeCall();
    
    System.out.println("Object of Iphone class");
    Iphone iphone=new Iphone();
    iphone.hasCamera();
    iphone.MakeCall();
    System.out.println("-----Object of ");
    Samsung samsung=new Samsung();
    samsung.hasCamera();
    samsung.MakeCall();
    
    System.out.println("----Object of Nokia Class");
    Nokia nokia=new Nokia();
    nokia.hasCamera();
    nokia.MakeCall();
    System.out.println("Object of the Child class refering to the Parent Class");
    PhoneClass p=new Iphone();
    p.MakeCall();
    p.hasCamera();
    
    PhoneClass p1=new Nokia();
    p1.hasCamera();
    p1.MakeCall();
    //craeting variable of a Parentclass
    PhoneClass parentPhone;
    parentPhone=new Iphone();
    parentPhone.hasCamera();
    parentPhone.MakeCall();
    
    parentPhone=new Samsung();
    parentPhone.hasCamera();
    parentPhone.MakeCall();
    
    
}
}
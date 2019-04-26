package com.class26;

public class PhoneClass {
public void MakeCall() {
	System.out.println("We can make a call");
}
public void hasCamera() {
	System.out.println("Phone has a Camera");
}
}


class Iphone extends PhoneClass {
	public void MakeCall() {
		System.out.println("We can FaceTime");
	}
	public void hasCamera() {
		System.out.println("Iphone has dual HD camera");
	}
}

class Samsung extends PhoneClass {
	public void hasCamera() {
		System.out.println("Samsung phone has 3 lenses camera");
	}
}
class Nokia extends PhoneClass{
	public void cannotBreak() {
		System.out.println("Nokia phones are unbreakable");
	}
}
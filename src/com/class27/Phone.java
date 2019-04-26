
package com.class27;
public abstract class Phone{
	
	public void makeCall() {
		System.out.println("Phone can call");
	}
	public void sendText() {
		System.out.println("Phone can sned text");
	}
	public abstract void unlockPhone();
	
	public abstract void viewPictures();
}
class iPhone extends Phone{

	@Override
	public void unlockPhone() { 
		System.out.println("To unlock Iphone we can use FaceId or FingerPrint");// concrete class-is class that is inherited from a abstract class or we implemented by interface 
		//and providing implementation of all unimplimented / abstract classes3
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view Pictures on IPhone can go to Images");
		// TODO Auto-generated method stub
		
	}
	
}


class Samsung extends Phone{

	@Override
	public void unlockPhone() {
		System.out.println("To unlock Samsung we need use password");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewPictures() {
		System.out.println("To view pic we can go to the Pictures");
		// TODO Auto-generated method stub
		
	}
	
}
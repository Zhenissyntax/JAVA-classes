
package com.class26;
public class User{
	String name;
	long mobile;
	public User(String name, long mobile) {
		this.name=name;
		this.mobile=mobile;
	}
	public User() {
		
	}
}
class userInfo extends User{
	public String address;
	public userInfo(String name, long mobile, String address) {
	super(name,mobile); 
	this.address=address;
	
	}
	public void userDetails(){
		System.out.println("User name is :"+name+" and phone number is "+mobile+ " and address is "+address);
	}
	

}


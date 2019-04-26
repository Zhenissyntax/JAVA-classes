
package com.class26;
public class TestBank{
	public static void main(String[] args) {
		
		Bank obj;
		obj=new BankA();
		System.out.println(obj.getBalance());
		obj=new BankB();
		System.out.println(obj.getBalance());
		obj=new BankC();
		System.out.println(obj.getBalance());
	}
}
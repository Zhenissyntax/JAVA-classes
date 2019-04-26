package com.class25;

public class Payment {  //overridden method
	public void makePayment() {
		System.out.println("We can make a payment with no fee");
	}

}

class MasterCard extends Payment{ //overridding method
	public void makePayment() {
		System.out.println("We can make payment with MC and 2%fee");
	}
	
}

